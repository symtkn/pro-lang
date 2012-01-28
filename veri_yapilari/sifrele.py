class Queue:
    def __init__(self):
             self.items = []
    def isEmpty(self):
             return self.items == []
    def enq(self, item):
             self.items.insert(0,item)
    def deq(self):
             return self.items.pop()
    def size(self):
             return len(self.items)

def sifrele(dizgi, N):
    """\
    >>> sifrele("merhaba", 3)
    rbeaamh
    """
    disk = Queue()
    new_dizgi = ""
    for i in dizgi:
        disk.enq(i)
    while not disk.isEmpty():
        for i in range(N - 1):
            disk.enq(disk.deq())
        new_dizgi += disk.deq()
    print new_dizgi

sifrele("merhaba", 3)
