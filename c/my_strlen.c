/*Verilen karakter dizinin uzunlugunu bulma*/
#include <stdio.h>

void mystrlen(char *str){
	int say = 0;
	char ch = str[say];
	while(ch != '\0'){
		say++;
		ch = str[say];
	}
	printf("%d", say);
}
int main(void){
	char dizi[] = "symtkn denemeden pes etme!";
	mystrlen(dizi);
	return 0;
}
