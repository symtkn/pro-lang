class Kompleks:
    def __init__(sayi,real,imag):
        sayi.gercel = real
        sayi.sanal = imag
    def Mutlak(sayi):
        sonuc = float((sayi.gercel**2 + sayi.sanal**2)**0.5)
        print sonuc
    def Yazdir(sayi):
        print sayi.gercel,'+',sayi.sanal,'i'
        
        
    
        
