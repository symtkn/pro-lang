#include <stdio.h>

int main(){
	int say1,say2;
	char tip;
	printf("İşlem tipini giriniz (+,-*,/): "); tip = getchar();
	printf("1. sayıyı giriniz: "); scanf("%d", &say1);
	printf("2. sayıyı giriniz: "); scanf("%d", &say2);
	switch(tip){	
		case '+': printf("%d\n", say1 + say2); break;
		case '-': printf("%d\n", say1 - say2); break;
		case '*': printf("%d\n", say1 * say2); break;
		case '/': printf("%d\n", say1 / say2); break;
	}
	return 0;
}
