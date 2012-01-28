class Stack:
    def __init__(self):
        self.liste = []
    def pop(self):
        return self.liste.pop()
    def push(self,item):
        return self.liste.append(item)
    def isEmpty(self):
        return self.liste == []
def parOnar(ifade):
    s = Stack()
    ifadeL = ifade.split()
    difade = []
    tokens = "*-+/"
    for i in range(len(ifadeL)):
        if ifadeL[i] == ')':
            s.push(i)
        difade.append(ifadeL[i])
        if ifadeL[i] in tokens:
            op = ifadeL[i+2]
            if op in tokens:
                difade.append('(')
                s.pop()
    while not s.isEmpty():
        difade.insert(0, '(')
        s.pop()
    ek = ""
    dizi = ek.join(difade)
    print dizi

parOnar("1 + 2 ) * 3 - 4 ) * 5 - 6 ) )")
parOnar("3 / 8 ) * 2 ) + 9 + 1 ) )")        
    
        
    
