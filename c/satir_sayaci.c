#include <stdio.h>
int main(void){
	int c, ss = 0;
	c = getchar();
	while(c != EOF){
		if(c == '\n')
			ss++;
		c = getchar();
	}
	printf("%d\n", ss);
	return 0;
}	

