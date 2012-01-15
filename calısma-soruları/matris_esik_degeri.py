def matris_esik_degeri(liste,item):
    for i in range(len(liste)):
        for j in range(len(liste[i])):
            if liste[i][j] < item:
                liste[i][j] = 0
            else :
                liste[i][j] = 1
    print liste
matris_esik_degeri([[12,3,4],[34,5,6,-9,0]],12)
