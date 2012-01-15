def ingiLizce_aLf_artan():
    kac = 0
    fin = open("words.txt")
    for satir in fin:
        satir = satir.strip()
        dizi = list(satir)
        dizi.sort()
        dizi1 = list(satir)
        if dizi1 == dizi:
            print satir
            kac += 1
        else: pass
    print "Alfabetik artan sozcuk sayisi:",kac
    fin.close()
ingiLizce_aLf_artan()
