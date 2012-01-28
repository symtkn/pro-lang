//Verilen kelime içerisinde istenilen hecenin aranmasi
#include <stdio.h>
#include <string.h>
void char_ara(char *str, char *bul_str){
	int i, k = 0;
	char *durum = "True";
	for(i = 0; i < strlen(str); i++){
		if(str[i] == bul_str[k]){
			k++;
			if(str[i+1] != bul_str[k]){
				durum = "False";
				break;
			}
		}
	}
	if(durum == "False")
		printf("False\n");
	else
		printf("True\n");
}
		
int main(void){
	char ara[] = "nano";
	char *dizi1 = "banano";
	char dizi2[] = "bananas";
	char dizi3[] = "bana";
	char dizi4[] = "ano";
	char_ara(dizi1, ara);
	char_ara(dizi2, ara);
	char_ara(dizi3, ara);
	char_ara(dizi4, ara);
	return 0;
}
