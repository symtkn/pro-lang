#include <stdio.h>
char my_toupper(char ch){
	if('a' <= ch <= 'z'){
		ch = ch - ('a' - 'A');
		return ch;
	}
}

int main(void){
	char ch;
	ch = my_toupper('a');
	printf("%c", ch);
	return 0;
}
