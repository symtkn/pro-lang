#!/usr/bin/env python
#-*- coding:utf8 -*-
    
class Polinom:
    def __init__(self, pList):
        self.p1 = pList
    def __add__(self, p2):
        global liste
        sayi = 0
        
        if len(p2.p1) != len(self.p1):
            if len(p2.p1) > len(self.p1):
                fark = len(p2.p1) - len(self.p1)
                while fark > 0:
                    self.p1.insert(0,0)
                    fark -= 1
                 
            else:
                fark = len(self.p1) - len(p2.p1)
                while fark > 0:
                    p2.p1.insert(0,0)
                    fark -= 1
        uzun = len(p2.p1)
        liste = []
        for i in range(uzun):
            sayi = self.p1[i] + p2.p1[i]
            if i == (uzun - 1):
                liste.append(str(sayi))
            else:
                k = uzun - i
                if sayi == 1:
                    dizim = "x^%d"%k
                else:
                    dizim = "%dx^%d"%(sayi, k-1)
                liste.append(dizim)
        a = self.__str__()
        return a
    def __str__(self):
        ek = ' + '
        newdiz = ek.join(liste)
        return newdiz
       
