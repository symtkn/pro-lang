def ters_arama(sozluk,value):
    degerler = sozluk.values()
    anahtarlar = sozluk.keys()
    kontrol = value in degerler
    if kontrol == False:
        print 'indeks bulunamadi.'
    else:
        for key in anahtarlar:
            if sozluk[key] == value:print key
ters_arama({'samsun':'karad.','antalya':'akde.','tokat':'karad.','Manisa':'ege'},'marmara')
