#include <stdio.h>
#include <ctype.h>
enum boyut {True, False} k = True;
int main(void){
	int ch;
	ch = getchar();
	getchar();
	if(islower(ch) == k)
		printf("True");		
	else if(isupper(ch) == k){
		printf("False");
	}
	return 0;
	
}
