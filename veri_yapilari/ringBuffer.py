class RingBuffer:
    def __init__(self, N):
        self.n = N
        self.liste = [None]* self.n
    def append(self, item):
        if self.liste == self.n*[None]:
            self.liste[-1] = item
        else:
            for k in range(self.n-1):
                self.liste[k] = self.liste[k +1]
            self.liste[-1] = item
    def get(self):
        return self.liste

halka= RingBuffer(4)
for i in range(10):
    halka.append(i)
    print halka.get()
        
    
