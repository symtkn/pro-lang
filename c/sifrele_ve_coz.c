#include <stdio.h>
#define ROT 20  /* istenilen oteleme ile sifrele */
#define mod 26 /* alfabe boyutu */

void sifrele(int c){
	int c_yeni;
	if(c >= 'A' && c <= 'Z'){
		c_yeni = 'A' + (c + ROT - 'A')%mod;
		putchar(c_yeni);
	}
	else if(c >= 'a' && c <= 'z'){		
		c_yeni = 'a' + (c + ROT - 'a')%mod;
		putchar(c_yeni);
	}
	else putchar(c);
}
void sifrecoz(int c){
	int c_yeni;
	int tmp;
	if(c >= 'A' && c <= 'Z'){
		tmp = (c - ROT - 'A')%mod;
		c_yeni = (tmp < 0) ? ('A' + mod + tmp):('A' + tmp);
		putchar(c_yeni);
	}
	else if(c >= 'a' && c <= 'z'){
		tmp = (c - ROT - 'a')%mod;
		c_yeni = (tmp < 0) ? ('a' + mod + tmp):('a' + tmp);
		putchar(c_yeni);		
	}
	else putchar(c);
}
int main(void){
	int c;
	printf("Bir metin yaz... \n");
	while((c = getchar()) != 10){  /* enter basana kadar karakter oku */
		sifrele(c);
	}
	/* enter tusuna bastıktan sonra devam et*/
	printf("\n Simdi de yukarıda sifreli olarak cikan metni yaz... \n");
	while((c = getchar()) != EOF){  /* ctrl + d (dosya sonu karakteri) ye basılana kadar karakter oku */
		sifrecoz(c);
	}
	return 0;
}