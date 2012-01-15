def en_uzun_kelime(cumle):
    depo = dict()
    kelime = str.split(cumle)
    for i in range(0,len(kelime)):
        depo[kelime[i]] = len(kelime[i])
    en_uzun = depo[kelime[0]]

    j = 0
    for i in range(0,len(kelime)):
        if depo[kelime[i]] >= en_uzun:
            j=i
            en_uzun = depo[kelime[i]]
    print "En uzun:",kelime[j],"\nuzunluk:",depo[kelime[j]]
            
        
