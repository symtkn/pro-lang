#include <stdio.h>
void yuvarla(float x, int y)
{
	int k=y;
	while(y+1>0)
	{
		x=x*10;
		y--;
	}
	int ondalikli;
	x=(int)x;
	ondalikli=(int)x%10;
	if (ondalikli>=5)
	{
		x=x-ondalikli+10;
	}
	if (ondalikli<5)
	{
		x=x-ondalikli;
	}
	for(y=0;y<k+1;y++)
	{
		x=x/10;
	}
	printf("%f",x);
}
int main()
{
	yuvarla(4.26958,3);
	yuvarla(4.20105,1);
}
	
