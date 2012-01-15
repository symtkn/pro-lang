def add_seyrek(a,b):
    key1 = a.keys()
    key2 = b.keys()
    liste = []
    for i in key1:
        if i not in key2:
            key2.append(i)
            
    for key in key2:
        sutun = key[1]
        if key[1] >= sutun:
            sutun = key[1]
        satir = key[0]
        if key[0] >= satir:
            satir = key[0]
    c = [0]*(sutun+1)
    for i in range(satir):
        for key in key2:
            c = [0]*(sutun+1)
            sat = key[0]
            sut = key[1]
        
        if i ==sat:
            c[sut] = a.get(key,0) + b.get(key,0)
            liste.insert(sat,c)
        else:liste.append(c)
            
    print liste
    
add_seyrek({(0,3):4,(2,4):8},{(0,3):1})
    
