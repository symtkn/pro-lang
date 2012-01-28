class Stack:
    def __init__(self):
        self.liste = []
    def isEmpty(self):
        return self.liste == []
    def pop(self, index = None):
        return self.liste.pop()
    def push(self, item):
        return self.liste.append(item)
    
def BaseConverter(decNumber, base):     #10'luk tabandaki sayıyı istenilen tabana cevirme
    kalanList = Stack()
    digits = "ABCDEF"
    newString = ""
    while decNumber > 0:
        kalan = decNumber % base
        decNumber = decNumber / base
        kalanList.push(kalan)

    while not kalanList.isEmpty():
        sayi = kalanList.pop()
        if sayi >= 10:
            newString += digits[int(sayi%10)]
        else:
            newString += repr(sayi)
    return newString


BaseConverter(23, 3)
BaseConverter(23, 8)
BaseConverter(23, 16)
BaseConverter(26, 16)
