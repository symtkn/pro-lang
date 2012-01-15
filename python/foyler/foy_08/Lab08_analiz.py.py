# -*- coding: cp1254 -*-
def analiz(liste):
    k,t,f,l,b = 0,0,0,0,0
    for i in liste:
        if type(i) == str:
            k += 1
        elif type(i) == int:
            t += 1
        elif type(i) == float:
            f += 1
        elif type(i) == list:
            l += 1
        else:
            b += 1
    print "karakter dizisi sayisi :",k,"\ntamsayi sayisi :",t,"\nondalık sayisi :",f,"\nliste sayisi :",l,"\nBoolean sayisi :",b
