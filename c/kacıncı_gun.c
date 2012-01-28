//Verilen bir tarihin yilin kacinci gunu oldugunu bulma
#include <stdio.h>

int yilin_gunu(int, int, int);
int artik_yil(int);

int main(void)
{
  int gun = 18;     /* tarih: 01 Ağustos 2003 */
  int ay  = 11;
  int yil = 2011;

  printf("%2d %2d  %d yilinin\n",gun,ay,yil );
  printf("%d. gunudur\n",yilin_gunu(gun,ay,yil) );

  return 0;
}

/* yil artıl yıl ise 1 aksi halde 0 gönderir */
int artik_yil(int yil)
{
   if( (yil%4==0) && ((yil%100!=0) || (yil%400==0)) ) return 1;
   else return 0;
}

/* yılın kaçıncı günü olduğunu hesaplar ve o günü gönderirir */
int yilin_gunu(int gun, int ay, int yil)
{
   int ygun = gun;

   switch(ay-1)
   {
     case 12: ygun += 31;
     case 11: ygun += 30;
     case 10: ygun += 31;
     case  9: ygun += 30;
     case  8: ygun += 31;
     case  7: ygun += 31;
     case  6: ygun += 30;
     case  5: ygun += 31;
     case  4: ygun += 30;
     case  3: ygun += 31;
     case  2: ygun += 28 + artik_yil(yil);  /* 28+1 veya 28+0 */
     case  1: ygun += 31;
   }

  return ygun;
}
