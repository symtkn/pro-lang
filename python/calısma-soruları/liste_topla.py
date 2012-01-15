# -*- coding: cp1254 -*-
def liste_topla(liste):
    m = 0
    for i in liste:
        toplam = 0
        if type(i) == list :
            for k in range(len(i)):
                toplam += int(i[k])
            print "d[",m,"]'nin elemanları toplamı",toplam
        m += 1
liste_topla([[2,3,4],4,[8,9],67])
