def my_append(liste,ch):
    u = len(liste)
    listem = [0]*(u+1)
    for i in range(u):
        listem[i] = liste[i]
    listem[-1] = ch
    print listem
my_append([1,2,3],"s")
