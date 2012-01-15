def my_capwords(cumle):
    cumle.split()
    sira = 0 
    for kelime in cumle:
        k = ord(kelime[0])
        if 97 <= k <=122:
            k -= 32
            k = chr(k)
            kelime = k +kelime[1:]
            cumle[sira] = kelime
            sira += 1
            
    
        else:
            cumle[sira] = kelime
            sira += 1
    ek = ''
    print ek.join(cumle)
my_capwords('seyma Tekin beyin cerrahi olacak')
            
