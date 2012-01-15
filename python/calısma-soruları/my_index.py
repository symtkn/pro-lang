def my_index(liste,item):
    sira = 0
    for i in liste:
        if item == i:
            print sira
        else:
            sira += 1
my_index([1,2,34,'dfdfw',-90],'dfdfw')
