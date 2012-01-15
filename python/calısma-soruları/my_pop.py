def my_pop(liste,sira):
    b = liste[sira]
    for index in range(len(liste)) :
        if index == sira:del liste[sira]
        else:pass
    print b
my_pop([1,2,34,54],2)
            
