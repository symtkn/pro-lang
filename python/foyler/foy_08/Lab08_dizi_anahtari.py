import math
def anahtar(dizi):
    listem = []
    liste = dizi.split('-')
    toplam = 0
    for i in range(len(liste)):
        y_int = int(liste[i])
        listem.append(y_int)
        toplam += listem[i]
    kac = len(listem)
    a = toplam /kac
    listem.sort()
    if kac/2 == kac/2.0:b = (listem[kac/2-1] + listem[kac/2])/2
    else: b = listem[(kac-1)/2]
    print a*b
    
