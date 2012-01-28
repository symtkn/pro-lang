#include <stdio.h>
#include <string.h>

void split(char *str, char ch){
	char *ptr;
	for(ptr = str; *ptr; ++ptr){
		if(*ptr != ch){
			*ptr = *str;
			printf("%c ", *ptr);
		}
		str++;
	}
}
void join(char *str, char ch){
	int boyut = (((strlen(str))*2)-1), i;
	char ptr[boyut];
	for(i = 0; i < strlen(str); ++i){
		if(str[i] != ch){
			ptr[i] = str[i];
			printf("%c", ptr[i]);
			if(i != strlen(str)-1){
				ptr[i+1] = ch;
				printf("%c", ptr[i+1]);
			}
		}
	}
}

int main(void){
	char dizi1[] = "abc", dizi2[] = "a-b-c";
	char token = '-';
	split(dizi2, token);
	join(dizi1, token);
	return 0;
}
