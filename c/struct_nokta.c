//Noktanın dikdortgensel bolge icerisinde olup olmadıgı kontrolu
#include <stdio.h>
struct nokta{
	int x, y;
	struct nokta *next;
};
void ara(struct nokta *p, int en, int boy){
	int x1, x2, w, h, y2, y3;
	x1 = p->x;
	p = p->next;
	y2 = p->y;
	x2 = p -> x;
	w = x2 -x1;
	p = p-> next;
	y3 = p -> y;
	h = y2-y3;
	if(( (w-en) < x1) && ( (h- boy) < y2))
		printf("nokta dikdörtgensel bölgenin icindedir.\n");
	else
		printf("dısındadır.\n");
}
int main(void){
	struct nokta nokta1, nokta2, nokta3, nokta4;
	nokta1.x = 50; nokta1.y = 100; nokta1.next = &nokta2;
	nokta2.x = 150; nokta2.y = 100; nokta2.next = &nokta3;
	nokta3.x = 150; nokta3.y = 50; nokta3.next = &nokta4;
	nokta4.x = 50; nokta4.y = 50; nokta4.next = &nokta1;
	ara(&nokta1, 75, 142);
	ara(&nokta1, 80, 90);
	ara(&nokta1, 80, 167);
	return 0;
}
