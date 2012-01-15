def  en_buyuk_sayi(liste):
    liste.sort()
    liste.reverse()
    sayi = 0
    for i in liste:
        sayi = (sayi + int(i))*10
    print sayi/10
en_buyuk_sayi([2,9,7])
