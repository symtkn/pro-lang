//1'den N'ye kadar olan sayilarin toplami

#include <stdio.h>
#define toplam(n) (n*(n+1))/2
void main(void){
	int n;
	printf("ust degeri giriniz: ");
	scanf("%d", &n);
	printf("%d", toplam(n));
}
