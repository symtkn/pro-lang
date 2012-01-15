# -*- coding: cp1254 -*-
import math
def mutlak_genel():
    while True:
        s = input("Karmaşık sayılar için 1,tamsayılar için 2,ondalık sayılar için 3,çıkmak için 4 giriniz:")
        if s==1 :    
            a = input("Gerçel kısmı giriniz:")
            b = input("sanal kısmı giriniz:")
            w = math.sqrt((a**2)+(b**2))
            print "Tamsayının mutlak değeri:",w
        elif s==2 :
            a = input("Tamsayıyı giriniz:")
            if a<0 :
                t = -1*a
                print "Tamsayının mutlak değeri:",t
            else :
                print "Tamsayının mutlak değeri:",a
        elif s==3 :
            a = input("Ondalıklı sayıyı giriniz:")
            if a<0 :
                k = -1*a
                print "Ondalıklı sayının mutlak değeri:",k
            else :
                print "Ondalıklı sayının değeri:",a
        else :
            break
