#!/usr/bin/env python
#-*- coding:utf8 -*-

class Stack:
    def __init__(self):
        self.liste = []
    def isEmpty(self):
        return self.liste == []
    def pop(self, index = None):
        return self.liste.pop()
    def push(self, item):
        return self.liste.append(item)
    def peek(self):
        return self.liste[len(self.liste) - 1]
    def size(self):
        return len(self.liste)
def parChecker(sembolString):
    s = Stack()
    s2 = Stack()
    denge = True
    index = 0
    opens = "{[("
    close = "}])"
    while index < len(sembolString) and denge:
        sembol = sembolString[index]
        if sembol in "([{":
            s.push(sembol)
            s2.push(index)
        else:
            if s.isEmpty():
                denge = False
                
            else:
                top = s.pop()
                at = s2.pop()
                if opens.index(top) != close.index(sembol):
                    denge = False
                   
        index += 1
    if not denge and s.isEmpty():
        print "ifadenin %d. tokeninda acilmadan %c \
parantez kapatilmaya calisildi." %(index, sembol)
    elif not denge and not s.isEmpty():
         print "ifadenin %d. tokeni olan %s acildi fakat %d. \
tokenda %c ile kapatilmaya calisildi." %(at+1, top, index, sembol)
    elif denge and not s.isEmpty():
        print "ifadenin %d. tokeni olan %c acildi fakat \
ifade sonuna kadar kapatilmadi." %(index, s.pop())
    else:
        print True
parChecker("[([]{{}})]")
parChecker("[]([[{}])")
parChecker("{[]}}")
parChecker("[(([[{}]]))")
