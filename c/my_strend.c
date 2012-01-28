#include <stdio.h>
#include <string.h>
int my_strend(char *s1, char *s2){
	int i , k = 0;
	for(i = 0 ; s2[k] != '\0'; i++){
		if(s1[i] == s2[k]){
			k++; 
		}
	}
	if(k == 0)
		return 0;
	else
		return 1;
}				

int main(void){
	char d1[] = "symtkn";
	char d2[] = "su";
	char d3[] = "beyza";
	int s1, s2;
	s1 = my_strend(d1, d2);
	s2 = my_strend(d1, d3);
	printf("%d\n %d\n", s1, s2);
	return 0;
}
