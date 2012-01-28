//Kelimenin onundeki ve sonundaki birden fazla boslugu silme
#include <stdio.h>
 
int main(void){
	char *str;
	char dizi[] = "Millet   merhaba! Nasılsınız?  symtkn     code  ";
	int say = 0, i = 0;
	for(str = dizi; *str; str++){
		if(*str == ' '){
			say += 1;
			if(say == 1){
				dizi[i] = *str;
				printf("%c", dizi[i]);
				i += 1;
			}
		}	
		else{
			dizi[i] = *str;
			printf("%c", dizi[i]);
			i += 1;
			say = 0;
		}
	
	}
}
