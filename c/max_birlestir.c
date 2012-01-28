/*Dizideki maksimum degeri bulma ve*
 *İki diziyi birlestirme*/
#include <stdio.h>
void max(int *dizi, int boyut){
	int i = 0, maxsay = dizi[0];
	for(i = 0; i < boyut; i++)
		if(dizi[i] > maxsay)
			maxsay = dizi[i];
	printf("%d\n", maxsay);
}
void birlestir(int *dizi1, int *dizi2, int b1, int b2){
	int newdizi[b1+b2], i, k = 0;
	int boyut = b1 + b2;
	for (i = 0; i < boyut; i++){
		if(i < b1){
			newdizi[i] = dizi1[i];
			printf("%d ", newdizi[i]);
		}
		else{
			newdizi[i] = dizi2[k];
			k++;
			printf("%d ", newdizi[i]);
		}
	}
}

int main(void){
	int dizi1[] = {1, 3, 49, 4, -5}, dizi2[] = {5, 6, -789, 8 ,9, 0, -23};
	int b1 = 5, b2 = 7;
	max(dizi1, b1);
	max(dizi2, b2);
	birlestir(dizi1, dizi2, b1, b2);
	return 0;
}
