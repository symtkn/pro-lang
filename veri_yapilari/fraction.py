class Fraction:
    def __init__(self, top, bottom):
        self.num = top
        self.den = bottom
    def show(self):
        print self.num,"/",self.den

    def __str__(self):
        return str(self.num)+"/"+str(self.den)

    def __add__(self,otherfraction):
        newnum = self.num*otherfraction.den +\
                 self.den*otherfraction.num
        newden = self.den*otherfraction.den
        return Fraction(newnum,newden)

    def gcd(self):                      #en buyuk ortak bolen bulma fonksiyonu
        while newnum%mewden != 0:
            newnum,newden = newden, newnum%newden
        return Fraction(newnum,newden)
    
        
    
