class oncelikli_kuyruk:
    def __init__(self):
        self.liste = []
    def peek(self):
        return self.liste[len(self.liste) - 1]
    def enq(self, item):
        eleman, oncelik = item
        if self.isEmpty():
            return self.liste.append(item)
        else:
            pee = self.peek()
            if oncelik < pee[1]:
                return self.liste.append(item)
            else:
                for ind, i in enumerate(self.liste):
                    if oncelik == i[1]:
                        return self.liste.insert(ind, item)
                    elif oncelik > i[1]:
                        return self.liste.insert(0, item)
    def deq(self):
        return self.liste.pop()
    def size(self):
        return len(self.liste)
    def isEmpty(self):
        return self.liste == []

ok = oncelikli_kuyruk()
ok.enq(("y", 2))
ok.enq(("m", 3))
ok.enq(("s", 1))
ok.enq(("t", 3))
foo = ok.deq()
print foo
    
    
