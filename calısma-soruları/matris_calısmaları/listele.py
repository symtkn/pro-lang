def listele(matris):
    liste = []
    keyler = matris.keys()
    degerler = matris.values()
    for key in keyler:
        a = keyler[0][1]
        if key[1] > a:
            a = key[1]
        b = keyler[0][0]
        if key[0] > b:
            b = key[0]
    c = [0]*a
    for i in range(b):
        liste.append(c)
        if i == keyler[i][0]:
            for j in liste:
                j[keyler[i][1]-1] = degerler[i]
                liste[i] = j
    print liste
listele({(0,3):5,(3,4):9})
