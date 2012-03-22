n = 0
liste = []
def ters_duz(dizi):
    global n
    global liste
    for i in range((len(dizi) - 1), -1, -1):
        print dizi[i]
        liste.append(dizi[i])
    n += 1
    if n == 1:
        ters_duz(liste)
        
        
        
        
        
