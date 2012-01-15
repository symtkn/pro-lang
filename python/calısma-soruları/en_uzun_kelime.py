def en_uzun_kelime(cumle):
    liste = cumle.split()
    uzunluklar = []
    for i in liste:
        uzunluk = reduce(lambda x,y:len(i), liste)
        uzunluklar.append(uzunluk)
    en_uzun = max(uzunluklar)
    sira = uzunluklar.index(en_uzun)
    print liste[sira]
