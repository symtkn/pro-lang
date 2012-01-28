#include <stdio.h>
void myreverse(char a[], int n){
	int l, r, i = 0;
	char temp;
	for(l = 0, r = n-1; l < r; l++, r--){
		temp = a[l];
		a[l] = a[r];
		a[r] = temp;
	}
	while(i < n){
		printf("%c", a[i]);
		i++;
	}
	
}
int main(void){
	char b[] = "Denizli horozu :) ";
	myreverse(b, 18);
	return 0;
}
