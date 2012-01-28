#include <stdio.h>
#include <string.h>
void divideBy2(dec){
	int i = 0, k, kalan, say = 0;
	int dizi[100];
	while(dec != 0){
		kalan = dec % 2;
		dec = dec /2;
		dizi[i] = kalan;
		i++;
		say++;
	}
	for(k = say-1; k != -1; k--)
		printf("%d", dizi[k]);
}
int main(void){
	int dec = 20;
	divideBy2(dec);
	return 0;
}
		
	
