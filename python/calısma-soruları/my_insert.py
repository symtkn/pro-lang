def my_insert(liste,sira,item):
    u = len(liste)
    listem = [0]*(u+1)
    k = 0
    for i in range(u+1):
        if sira == i:
            listem[i] = item
        else:
            listem[i] = liste[k]
            k +=  1
    print listem
my_insert([1,2,3],2,7)
        
