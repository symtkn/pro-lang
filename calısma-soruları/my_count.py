def my_count(liste,item):
    listem = []
    for i in liste:
        if i not in listem:
            listem.append(i)
    kac = 0
    for i in liste:
        if item == i:
            for j in listem:
                if j == i:
                    kac += 1
        else:continue
    print kac
my_count([1,2,34,5,6,34,5,'seyma','34','34',34],'34')
        
