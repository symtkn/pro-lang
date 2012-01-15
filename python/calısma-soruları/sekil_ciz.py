# -*- coding: cp1254 -*-
#!/usr/bin/python
def dikdortgen_ciz(en,boy):
    isaret='' 
    for i in range(0,en):
        isaret=isaret+'*'
    for j in range(0,boy):
        print isaret
def dik_ucgen_ciz(taban):
    isaret=''
    for i in range(0,taban):
        isaret=isaret+'*'
        print isaret
def kare_ciz(kenar):
    """
    kenar tamsayı olmalıdır.
    ornek kullanım:
    kare_ciz(4)
    """
    dikdortgen_ciz(kenar,kenar)
    
        
