# -*- coding: cp1254 -*-
def esik_degeri(liste,item):
    kac = 0
    for i in liste:
        sira = liste.index(i)
        if i < item:
            kac += 1
            liste[sira] = 0
        else :
            liste[sira] = 1
    print liste,"esik degeri altındaki deger sayisi:",kac
esik_degeri([1,2,3,5,6,78,-3],6)
            
            
