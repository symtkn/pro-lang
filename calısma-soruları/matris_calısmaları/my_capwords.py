def my_capwords(cumle):
    liste = cumle.split()
    m = 0
    for i in liste:
        dizi = ""
        k = ord(i[0])
        if 97 <= k <= 122:
            k -= 32
            ch = chr(k)
            dizi = ch + i[1:]
            liste[m] = dizi
            
        else :liste[m] = i
        m += 1
    ek = " "
    a = ek.join(liste)
    print a
my_capwords("seyma, Tekin bmb de okuyor.")
