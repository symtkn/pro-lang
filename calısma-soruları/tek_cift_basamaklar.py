# -*- coding: cp1254 -*-
def tek_cift_basamaklar(sayi):
    tek,cift= 0,0    
    while sayi:
        basamak = sayi % 10
        sayi = sayi / 10
        if basamak % 2 == 1:
            tek += basamak
        else:
            cift += basamak
    print "Tek basamaklar toplamı:%s"%(tek)
    print "Çift basamaklar toplamı:%s"%(cift)
