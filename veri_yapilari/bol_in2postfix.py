# -*- coding: utf-8 -*-
class Stack():
    def __init__(self):
        self.items=[]
    def isEmpty(self):
        return self.items==[]
    def push(self,item):
        self.items.append(item)
    def pop(self):
        return self.items.pop()
    def peek(self):
        return self.items[len(self.items)- 1]
    def size(self):
        return len(self.items)


def bol_in2postfix(bexpr):
    """\
    >>> bol_in2postfix("A B C + D")
    A B * C * D +
    """
    tmp = bexpr.split()
    token_List = []
    state = 0
    uppercase_str = "ABCD"
    
    for token in tmp:
        if token in uppercase_str and state == 1:
            token_List.append('*')
            
        token_List.append(token)

        if token in uppercase_str:
            state = 1
        else:
            state = 0
    say = 0
    ifade = []
    ek = " "
    s = Stack()
    for i in token_List:
        if i in uppercase_str:
            ifade.append(i)
            say += 1
            if say == 2:
                ifade.append(s.pop())
                say = 1
        else:
            s.push(i)
    d_ifade = ek.join(ifade)
    print d_ifade
bol_in2postfix("A B C + D")
