#!/usr/bin/python
# -*- coding: utf-8 -*-
class LogicGate:
    def __init__(self, n):
        self.label = n
        self.Output = None
    def getLabel(self):
        return self.label
    def getOutput(self):
        self.Output = self.performGateLogic()
        return self.Output

class BinaryGate(LogicGate): #LogicGate sinifini miras alma
    def __init__(self, n):     #Alt(cocuk) sinifin __init__() metodu
        LogicGate.__init__(self, n)       #ust sinifin yapici metodunu cagirma
        self.pinA = None       #ilklendirme
        self.pinB = None       #ilklendirme      
    def getPinA(self):
        if self.pinA == None:
            return input("Pin A giris degerini" + self.getLabel() + "kapısı için gir.")
        else:
            return self.pinA.getFrom().getOutput()
    def getPinB(self):
        if self.pinB == None:
            return input("kapı için Pin B degerini gir" + self.getLabel() + "=>" )
        else:
            return self.pinB.getFrom().getOutput()
    def setNextPin(self, source):
        if self.PinA == None:
            self.pinA = source
            
class AndGate(BinaryGate):
    def __init__(self, n):
        BinaryGate.__init__(self, n)
    def performGateLogic(self):
        a = self.getPinA()
        b = self.getPinB()
        if a == 1 and b == 1:
            return 1
        else:
            return 0

class OrGate(BinaryGate):
    def __init__(self, n):
        BinaryGate.__init__(self, n)
    def performGateLogic(self):
        a = self.getPinA()
        b = self.getPinB()
        if a == 1 or b == 1:
            return 1
        else:
            return 0

class UnaryGate(LogicGate):
    def __init__(self, n):
        LogicGate.__init__(self, n)
        self.pin = None
    def getPin(self):
        if self.pin == None:
            return input("giris pini gir bu kapı için " + self.getLabel() + "=>")
        else:
            return self.pin.getFrom().getOutput()
        
    def setNextPin(self, source):
        if self.pin == None:
            self.pin = source
        else:
            print "Bağlanılamıyor: Giriş boş değil"

class NotGate(UnaryGate):
    def __init__(self, n):
        UnaryGate.__init__(self, n)
        if self.pin() == 1:
            return 0
        else:
            return 1
class Connector:
    def __init__(self, fgate, tgate):
        self.fromgate = fgate
        self.togate = tgate
        tgate.setNextPin(self) #fonksiyonun referans noktasını connector'ün çıkışı
                            #olarak belirledik.
        
    def getFrom(self):
        return self.fromgate
    def gateTo(self):
        return self.togate
    
                

            
            
    
        
