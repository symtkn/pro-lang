def my_reverse2(liste):
    liste2 = []
    for i in liste:
        liste2.append(i)
    k = -1
    for i in range(len(liste)):
        liste[i] = liste2[k]
        k -= 1
    print liste
my_reverse2([1,23,'ceng'])
        
