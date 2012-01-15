def value_siralama(sozluk_matris):
    key = sozluk_matris.keys()
    deger = sozluk_matris.values()
    liste = []
    for i in range(len(deger)):
        byk = max(deger)
        deger.remove(byk)
        for j in key:
            if sozluk_matris[j] == byk:
                print key[i],':',byk
value_siralama({(0,2):3,(1,2):8,(4,0):1})
    
