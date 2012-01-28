class Queue:
    def __init__(self):
        slef.items = []
    def isEmpty(self):
        return self.items == []
    def enq(self, item):
        self.items.append(item)
    def deq(self):
        return self.items.pop()
    def size(self):
        return len(self.items)
