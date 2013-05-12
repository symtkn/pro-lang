#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

#define M 2
#define K 3
#define N 3
#define NUM_THREADS 5

//Test data
int A [M][K] = {{1, 4, 3}, {2, 5, 2}};  
int B [K][N] = {{8, 7, 6}, {5, 4, 3}, {1, 2, 2}};
int C [M][N];


typedef struct _matrix_t {
        int i; /* row */
        int j; /* column */
} matrix_t;

static matrix_t *data;
pthread_mutex_t lock;

void *worker(void *parameter);
static void dispatcher(int horizontal_element, int vertical_element);
static void display(void);
static void destroy(void);

int
main(int argc, char *argv[])
{
        int row, col, step, rc_control;
        for (row = 0; row < M; row++) {
                for (col = 0; col < N; col++) {
                        //Assign a row and column for each thread
                        dispatcher(row, col);
                        pthread_t tid;
                        //Create the thread
                        for (step = 0; step < NUM_THREADS; step++) {
                                //printf("Main: creating thread %d\n", step);
                                rc_control = pthread_create(&tid, NULL, worker, data);
                                if (rc_control) {
                                        printf("ERROR; return code from pthread_create() is %d\n", rc_control);
                                        exit(-1);       //or exit(EXIT_FAILURE);
                                }
                        }
                        //Make sure the parent waits for all thread to complete
                        pthread_join(tid, NULL);
                }
        }

        //Print out the resulting matrix
        display();
        //flush memory
        destroy();
        //lock the destruction
        pthread_mutex_destroy(&lock);
        exit(EXIT_SUCCESS);
}


//The thread will begin control in this function
void
*worker(void *parameter)
{
        matrix_t *input = parameter; // the structure that stores our data
        int counter, sum = 0;
        //row multiplied by column
        for (counter = 0; counter < K; counter++) {
                sum += A[input->i][counter] * B[counter][input->j];
        }

        pthread_mutex_lock(&lock);
        C[input->i][input->j] = sum;
        pthread_mutex_unlock(&lock);
        pthread_exit(NULL);
}

static void
dispatcher(int horizontal_element, int vertical_element)
{
        data = (matrix_t *) malloc(sizeof(matrix_t));
        data->i = horizontal_element;
        data->j = vertical_element;
}

static void
display(void)
{
        int row, col;
        for (row = 0; row < M; row++) {
                for (col = 0; col < N; col++) {
                        printf("%d ", C[row][col]);
                }
                printf("\n");
        }
}

static void
destroy(void)
{
        free(data);
}

/*OUTPUT:
 *      31 29 24        *
 *      43 38 31        *
 */
