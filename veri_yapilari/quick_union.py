# -*- coding: utf-8 -*-

nokta_sayisi = input("Kullanılacak nokta sayısı:")
nokta_dizisi = range(nokta_sayisi)
while True:
    girdi = raw_input("bağlantı :")
    ilk, son = girdi.split("-")
    gecici_ilk = int(ilk)
    
    while gecici_ilk != nokta_dizisi[gecici_ilk]:
        gecici_ilk = nokta_dizisi[gecici_ilk]
    gecici_son = int(son)

    while gecici_son != nokta_dizisi[gecici_son]:
        gecici_son = nokta_dizisi[gecici_son]

    if gecici_ilk != gecici_son:
        nokta_dizisi[gecici_ilk] = gecici_son
    print girdi + " ",
    print "Yeni durum: " + str(nokta_dizisi)
    
    
