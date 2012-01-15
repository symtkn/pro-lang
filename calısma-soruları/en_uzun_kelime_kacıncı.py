def en_uzun_kelime_kac(cumle):
    liste = cumle.split()
    listem = []
    sira = 0
    for i in liste:
        uzunluk = len(i)
        listem.append(uzunluk)
    k = listem[0]
    for i in listem:
        if i > k:
            sira += 1
            k = i
    print 'En uzun kelime:',liste[sira],' ve uzunlugu:',k
en_uzun_kelime_kac('opr doctor Seyma Tekin')
            
