# -*- coding: utf-8 -*-
from stack import *
def postfixEval(postfixifade):
    s = Stack()
    tokenList = postfixifade.split()
    for token in tokenList:
        if token in "0123456789":
            s.push(int(token))
        else:
            say1 = s.pop()
            say2 = s.pop()
            sonuc = doMath(token, say1, say2)
            s.push(sonuc)
    son = s.pop()
    return son
def doMath(op, op1, op2):
    if do == "*":
        return op1 * op2
    else:
        if op == "/":
            return op1 / op2
        else:
            if op == "+":
                return op1 + op2
            else:
                return op1 - op2
            
