def en_buyuk_deger(liste):
    k = 0
    for i in range(len(liste)):
        if int(liste[i]) >= k :
            k += int(liste[i])
        else:pass
    print  k
en_buyuk_deger([5,8,2456,7,98,45])
