#include <stdio.h>
#define N 16

int 
main(void)
{
	int n; /* üs değeri */
	int kuv = 1; /* 2'nin ilk kuvveti */
	printf("\t   n \t     2^n \n");
	printf("\t =============== \t \n");

	for (n = 0; n <= N ; n++){
		printf("\t %3d \t %6d \n", n, kuv);
		kuv = 2 * kuv;
	}
	return 0;
}

