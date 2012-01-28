#include <stdio.h>
struct node {
	int val;
	struct node *next;
};
void topla(struct node *p){
	int toplam = p-> val;
	while(p -> next != NULL){
		p = p -> next;
		toplam += p-> val;
	}
	printf("%d", toplam);
}
int main(void){
	struct node say1, say2;
	say1.val = 88; say1.next = &say2;
	say2.val = 99; say2.next = NULL;
	topla(&say1);
	return 0;
}
	
