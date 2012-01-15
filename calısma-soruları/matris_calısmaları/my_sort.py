def my_sort(liste):
    liste1,liste2,liste3 = [],[],[]
    for ch in liste:
        m = str(ch)
        k = ord(m)
        liste1.append(k)
    for i in range(len(liste1)):
        max_ord = max(liste1)
        liste2.insert(0,chr(max_ord))
        liste1.remove(max_ord)
    for j in liste2:
        cins = type(j)
        if cins == int or cins == float:
            liste1.append(j)
            min_ch = min(liste1)
            liste3.append(int(min_ch))
            liste1.remove(min_ch)
        elif cins == str:
            liste3.append(j)
    print liste3
my_sort([1,2,'d','a',3,-1])
