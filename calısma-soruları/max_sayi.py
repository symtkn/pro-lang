#!/usr/bin/env python
while True:
    try:
        print "Girilen en büyük sayý:",reduce(lambda x,y:max(x,y),input("Lütfen sayýlarý aralarýna virgül koyarak giriniz:"))
        break
     except TypeError : return "HATA!"  
                                              


       
