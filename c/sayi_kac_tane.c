//sayi katarında verilen sayıların kaç adet oldugu
#include <stdio.h>
int main(void){
	char c; 
	int sayi = 0;
	while(1){
		c = getchar();
		if((c >= '0') && (c <= '9'))
			sayi += 1;
		else
			break;
	}
	printf("sayi katarı içerisinde %d tane sayi vardir.", sayi);
	return 0;
}
			
