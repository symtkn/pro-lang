# -*- coding: cp1254 -*-
def en_kisa_kelime(cumle) :
    depo = dict()
    kelime = cumle.split()
    for i in range (0,len(kelime)):
        depo[kelime[i]] = len(kelime[i])
    en_kisa = depo[kelime[0]]

    j = 0
    for i in range (0,len(kelime)):
        if depo[kelime[i]] <= en_kisa:
            j = i
            en_kisa = depo [kelime[i]]
    print "en kısa :",kelime[j],"\nuzunluk:",depo[kelime[j]]
