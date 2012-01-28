class sinirli_halka_kuyruk:
    def __init__(self, boyut):
        self.liste = []
        self.N = boyut
        self.ek = boyut - 1
    def peek(self):
        return self.liste[len(self.liste) - 1]
    def enq(self, item):
        if self.N == len(self.liste):
            self.liste[self.ek] = item
            self.ek -= 1
            if self.ek < 0:
                self.ek = self.N - 1
            return self.liste[self.ek]
        else:
            return self.liste.insert(0, item)
    def deq(self):
        d = self.liste.pop(self.ek)
        print d
    def size(self):
        return len(self.liste)
    def isEmpty(self):
        return self.liste == []
        
hk = sinirli_halka_kuyruk(3)
hk.enq("A")
hk.enq("B")
hk.enq("C")
hk.enq("D")
hk.deq()
            
                
