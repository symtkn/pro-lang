# -*- coding: cp1254 -*-
def ardisik_toplam(n):
    if n > 0 and type(n) == int :
        if  n < 2 :
            return n
        elif n == 2:
            return n + 1
        else :
            return ardisik_toplam(n-2) + ardisik_toplam(n-1) 
    else : print "Lütfen pozitif bir tamsayı giriniz."        
            
            
