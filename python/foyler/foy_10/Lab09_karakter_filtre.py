def karakter_filtre(dosya_adi,karakter):
    fin = open(dosya_adi)
    for satir in fin:
        if karakter in satir:
            pass
        else : print satir.strip()
karakter_filtre('sozcuk.txt','j')
