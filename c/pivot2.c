//[1, 11, 2, 3, 20, 4, 5, 15] listesi gibi listeler için quick sort işlevi
#include <stdio.h>
int main(void){
	
	int dizi[] = {1, 11, 36, 3, 20, -4, 5, 15, 108};
	int boyut = 9, pivot =20;
	int new_dizi[boyut], i, k, m, say = 0, t;
	
	for(i = 0; i< boyut; i++)
		if(dizi[i] > pivot){
			new_dizi[say] = dizi[i];
			say++;
		}
	for(k =0; k < boyut; k++) 
		if(dizi[k] == pivot){
			new_dizi[say] = dizi[k];
			say++;
		}
	for(m = 0; m < boyut; m++)
		if(dizi[m] < pivot){
			new_dizi[say] = dizi[m];
			say++;
		}
	for(t = 0; t < boyut; t++)
		printf("%d ", new_dizi[t]);
	return 0;
}

