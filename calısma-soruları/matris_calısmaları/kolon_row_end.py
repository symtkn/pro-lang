def kolon_row_end(a,b):
    liste = []
    liste.append(a)
    liste.append(b)
    i= 0
    for eleman in liste:
        eleman.append(0)
        eleman.insert(0,0)
        liste[i]= eleman
        i += 1
    print liste

kolon_row_end([1, 1],[0, 1])
