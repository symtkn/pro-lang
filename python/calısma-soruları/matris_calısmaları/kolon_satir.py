def kolon_satir(liste):
    u1 = len(liste)
    for  i in range(u1):
        liste[i].append(0)
        liste[i].insert(0,0)
    u2 = len(liste[i])
    c = [0]*u2
    liste.append(c)
    liste.insert(0,c)
    print liste
