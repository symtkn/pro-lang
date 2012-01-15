fin = open("dosya_adi.py","r")
satir_listesi = fin.readlines()
for i in range(len(satir_listesi)):
    en_uzun_satir = len(satir_listesi[0])
    for j in range(len(satir_listesi)):
        if en_uzun_satir < len(satir_listesi[j]):
            en_uzun_satir = len(satir_listesi[j])
            en_uzunu = satir_listesi[j]

cumle = en_uzunu.split()
max_uzunluk = len(cumle[0])
for kelime in cumle:
    if len(kelime) > max_uzunluk:
        max_uzunluk = len(kelime)
        sira = cumle.index(kelime)
en_uzun_kelime = cumle[sira]

print 'en uzun cumle:',en_uzunu,'uzun kelime:',en_uzun_kelime
