# -*- coding: cp1254 -*-
def en_buyuk_basamak(sayi):
    a = repr(sayi) #Sayıyı karakter dizisine çeviriyoruz.
    b = 0          #Basamak değeri en küçük sıfır olabileceğinden,değişkene sıfır değerini atıyoruz.
   
    for i in a :  
        i = int(i) #a daki öğeyi integer'a çeviriyoruz.
        if i >= b : b = i #eğer i deki değer b dekinden büyükse,değeri b ye atıyoruz
        else : pass     #Küçük değilse de es geçiyoruz.
    return b
