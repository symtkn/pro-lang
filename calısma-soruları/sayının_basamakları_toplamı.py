# -*- coding: cp1254 -*-
#!/usr/bin/env python
def basamak_degeri_topla(sayi):
    deger = 0
    while sayi :
        basamak = sayi % 10 #Sayının modülünü alıp basamak degiskenine atadık.
        sayi = sayi / 10
        deger += basamak #Basamak degerini,deger adlı değişkene atadık.
    print "toplam = %s"% (deger)
        
