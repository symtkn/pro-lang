def en(liste):
    for i in liste:
        if type(i) == list:
            sayi,t,m = 0,0,0
            for k in range(len(i)):
                if int(i[k]) >= t:
                    t = int(i[k])
                    sayi += t*10
                m += 1
                i = i[:m]+i[:m+1]
                k = 0
        sayi = sayi/10
        elif sayi >= int(i):
            return sayi
        else :
            return int(i)
