/*Belirlenen karakter ardarda 3 kez yazilmissa,
 *o karakteri ekrana yazan sifre cozme algoritmasi*/
#include <stdio.h>
#include <string.h>
void sifre_coz(char *str){
	int i = 0, say = 0, k ;
	char ch;
	while(i < strlen(str)){
		k = i + 1;
		ch = str[i];
		while(ch == str[k]){
			say += 1;
			k += 1;
		}
		if(say == 2){
			if(str[i] != str[i-1])
				printf("%c", ch);
			i += 3;
			printf("%c",ch);
			say = 0;
		}
		else{
			i += 1;
			say = 0;
			
		}
	}
}
int main(void){
	char *s = "abcdddeefghhhhijjjjj";
	sifre_coz(s);
	return 0;
}
