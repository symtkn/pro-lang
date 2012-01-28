#include <stdio.h>
#include <string.h>
int ispalindrome(char *str){
	int i, k;
	for(i = 0, k =strlen(str)-1; i <= k; i++, k--){
		if(str[i] == str[k])
			return 1;
		else
			return 0;
	}
}

int main(void){
	char dizi1[] = "radar";
	char *dizi2 = "kelek";
	char dizi3[] = "melek";
	int sonuc1, sonuc2, sonuc3;
	sonuc1 = ispalindrome(dizi1);
	sonuc2 = ispalindrome(dizi2);
	sonuc3 = ispalindrome(dizi3);
	printf("%d\n%d\n%d", sonuc1, sonuc2, sonuc3);
	return 0;
}
