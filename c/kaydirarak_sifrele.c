#include <stdio.h>
#include <stdlib.h>
char * sifrele(char * metin, int kayma){
	char *new_d;
	int n, i = 0, basla, k;
	//strlen
	for(n = 0; *metin; metin++)
		n++;
	new_d = (char *)calloc(n+1, sizeof(char));
	new_d[n] = '\0';
	for(basla = (n-kayma); basla < n; basla++){
		new_d[i] = metin[basla];
		i++;
	}
	for (k = 0; k < basla; k++){
		new_d[kayma] = metin[k];
		kayma++;
		
	}	
	return new_d;
}
int main(void){
	char * dizi = sifrele("merhaba", 3);
	/*while(*dizi){
		printf("%c", *dizi);
		dizi++;
	}
	 */
	
	putchar(*dizi);
	return 0;
}
	
