def icice_max_deger(liste):
    liste1 = []
    for i in liste:
        if type(i) == list:
           for n in range(len(i)):
                for j in i:
                    
                    if type(j) == list:
                        for n in range(len(j)):
                            i = j
                    else:
                        liste1.append(j)
        else:
            liste1.append(i)
    print liste1
icice_max_deger([[[1,2,[3]],4],-13,5])
