class oncelikli_halkaKuyruk:
    def __init__(self, boyut):
        self.liste = []
        self.N = boyut
    def peek(self):
        return self.liste[len(self.liste) - 1]
    def enq(self, item):
        eleman, priority = item
        if self.N == len(self.liste):
            d = self.liste.pop(0)
            if priority < self.liste[self.N - 2][1]:
                return self.liste.append(item)
            else:
                for ind, i in enumerate(self.liste):
                    if priority > i[1]:
                        return self.liste.insert(0, item)
                    elif priority == i[1]:
                        return self.liste.insert(ind - 1, item)
        else:
            if self.isEmpty():
                return self.liste.append(item)
            else:
                pee = self.peek()
                if priority < pee[1]:
                    return self.liste.append(item)
                else:
                    for yer, k in enumerate(self.liste):
                        if priority == k[1]:
                            return self.liste.insert(yer - 1, item)
                        elif priority > k[1]:
                            return self.liste.insert(0, item)
    def deq(self):
        d = self.liste.pop()
        print d[0]
    def size(self):
        return len(self.liste)
    def isEmpty(self):
        return self.liste == []

ohk = oncelikli_halkaKuyruk(3)
ohk.enq(("A", 2))
ohk.enq(("B", 1))
ohk.enq(("C", 3))
ohk.enq(("S", 2))
ohk.enq(("T", 2))
ohk.deq()


                    
            
