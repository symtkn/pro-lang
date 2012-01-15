# -*- coding: utf-8 -*-
def hizli_fibonacci(n):
    if n < 0 or type(n) == float:print "Lütfen pozitif bir tam sayi giriniz."
    else:
        sozluk = {0:0,1:1,2:1,3:2,4:3,5:5,6:8,7:13,8:21,9:34,10:55}
        key_listesi = sozluk.keys()
        kontrol = n in key_listesi
        if kontrol == True:print sozluk[n]
        else:
            a,b = 0,1
            for i in range(n-1):
                a,b = b,a+b
            print b
hizli_fibonacci(7)
hizli_fibonacci(-7)
hizli_fibonacci(12.7)
hizli_fibonacci(11)
