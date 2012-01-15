def liste_analizi(liste):
    k,f,t,L,b = 0,0,0,0,0
    for i in liste:
        cins = type(i)
        if cins == str:
            k += 1
        elif cins == int:
            t += 1
        elif cins == float:
            f += 1
        elif cins == list:
            L += 1
        else:
            b += 1
    print "Karakter dizisi sayisi:",k,"\nTamsayi sayisi:",t,"\nOndalikli sayi sayisi:",f,"\nBoolean sayisi:",b,"\nListe sayisi:",L
