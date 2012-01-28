//turner yapisini kullanarak mutlak deger hesaplama
#include <stdio.h>
int abs(int x){
	return (x > 0) ? x : (-1*x);
}

float f_abs(float x){
	return (x > 0) ? x : ((-1.0)*x);
}

int main(void){
	int a = -97, b = 22, c = 0;
	float k = 17.9, t = 65.99, m = -13.2;
	a = abs(a);
	b = abs(b);
	c = abs(c);
	k = f_abs(k);
	t = f_abs(t);
	m = f_abs(m);
	printf("%d %d %d %.2f %.2f %.2f", a, b, c, k, t, m);
	return 0;
}
