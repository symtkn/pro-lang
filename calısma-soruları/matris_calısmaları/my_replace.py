def my_replace(s,old,new):
    dizi = ""
    for i in s:
        if i == old:
            dizi += new
        else : dizi += i 

    print dizi
    
