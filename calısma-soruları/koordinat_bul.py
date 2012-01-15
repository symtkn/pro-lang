# -*- coding: cp1254 -*-
#!/usr/bin/python

def koordinat_bul(x,y):
    if x>0 & y>0:
        print"1.bölge"
    elif x<0:
        if y>0:
            print"2.bölge"
        else:
            print"3.bölge"
    elif x<0 & y<0:
        print"4.bölge"
