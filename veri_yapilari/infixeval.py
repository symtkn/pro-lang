class Stack:
    def __init__(self):
        self.liste = []
    def isEmpty(self):
        return self.liste == []
    def pop(self):
        return self.liste.pop()
    def push(self, item):
        return self.liste.append(item)
    def size(self):
        return len(self.liste)
def infixeval(bexpr):
    s = Stack()
    liste = bexpr.split()
    say = 0
    for i in liste:
        if i in "TF":
            if say == 0:
                s.push(i)
                say += 1
            else:
                s.push('*')
                s.push(i)
        elif i == '+':
            s.push(i)
            say = 0
    while s.size() > 2:
        token1 = s.pop()
        op = s.pop()
        token2 = s.pop()
        if op == '+':
            if token1 == 'F' and token2 == 'F':
                s.push('F')
            else:
                s.push('T')
        elif op == '*':
                if token1 == 'T' and token2 == 'T':
                    s.push('T')
                else:
                    s.push('F')
    son = s.pop()
    print son
            
   
infixeval("T T F + T")
infixeval("F T + T + F")
