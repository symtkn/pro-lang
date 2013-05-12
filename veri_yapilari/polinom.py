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
            if sayi != 0:
                if i == (uzun - 1):
                    liste.append(str(sayi))
                else:
                    k = uzun - i -1 
                    if sayi == 1:
                        if k == 0:
                            dizim = str(sayi)
                        if k == 1:
                            dizim = "x"
                        if not  k in [0, 1]:
                            dizim = "x^%d"%(k)
                    elif sayi != 1:
                        if k == 1:
                            dizim = "%dx"%(sayi)
                        if k != 1:
                            dizim = "%dx^%d"%(sayi, k)
                    liste.append(dizim)
        a = self.__str__()
        return a
    def __str__(self):
        ek = ' + '
        newdiz = ek.join(liste)
        return newdiz
       
p1 = Polinom([2, 6, 3])
p2 = Polinom([1, 9, -3, 7, 5])
p5 = Polinom([2, 3, 3, 0])
p3 = p1 + p2
p4 = p2.__add__(p5)
print p3
print p5

