class Karakter:
    def __init__(self,arg_karakter):
        self.kdizi = arg_karakter
        sozcuk = Karakter()
    def Birlestir(self,ek_karakter):
        return self.kdizi + ek_karakter
    def KesitAl(self,a,b):
        return self.kdizi[a:b+1]
    def Tekrarla(self,kac):                 
        return self.kdizi*kac
    def Birlestir_Tut(self,ek_kdizi):
        self.kdizi = self.kdizi + ek_kdizi
    def KesitAl_Tut(self,a,b):
        self.kdizi = self.kdizi[a:b+1]
    def Tekrarla_Tut(self,kac):
        self.kdizi = self.kdizi*kac
    
