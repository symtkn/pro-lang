class Stack:
    def __init__(self):
        self.liste = []
    def isEmpty(self):
        return self.liste == []
    def pop(self):
        return self.liste.pop()
    def push(self, item):
        return self.liste.append(item)
    
def prefixEval(prefixdizi):
    s = Stack()
    tokenList = prefixdizi.split()
    for i in range(len(tokenList)-1, -1, -1):
        if tokenList[i] in  "0123456789":
            s.push(int(tokenList[i]))
        else:
            say1 = s.pop()
            say2 = s.pop()
            sonuc = doMath(tokenList[i], say1, say2)
            s.push(sonuc)
    c = s.pop()
    return c
def doMath(token, op1, op2):
    if token == '*':
        return op1 * op2
    elif token == '/':
        return op1 / op2
    elif token == '+':
        return op1 + op2
    else:
        return op1 - op2

prefixEval("+ + 6 * 3 4 9")
prefixEval("- * + 1 2 5 * - 6 2 + 1 9")
