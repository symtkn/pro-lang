#include <stdio.h>

int
main(void)
{
	int c, sayac = 0;
	while((c = getchar()) != EOF){
		if( c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')
			sayac++;
	}
	printf("Toplam harf sayısı : %d", sayac);
	return 0;
}
