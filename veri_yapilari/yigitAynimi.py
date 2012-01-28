# -*- coding: utf-8 -*-
from stack import *
def yigitAynimi(s1, s2):
    if  s1.isEmpty() or  s2.isEmpty():
        return False
    else:
        item1 = s1.pop()
        item2 =  s2.pop()
        if item1 == item2:
            yigitAynimi(s1, s2)
            return True
        else:
            return False
    



s1 = Stack()
s2 = Stack()
s1.push(3333)
s1.push(-12)
s2.push("sym")

s3 = Stack()
s4 = Stack()
s3.push('t')
s3.push(-99)
s4.push("t")
s4.push(-99)

s5 = Stack()
s6 = Stack()
s5.push("beyza")
s5.push('almula')
s5.push('2003')
s6.push("beyza")
s6.push('almula')
s6.push('2003')

s7 = Stack()
s8 = Stack()
s7.push("necmi")
s7.push("ayse")
s8.push(1)
s8.push("nisan")

a = yigitAynimi(s1, s2)
b = yigitAynimi(s3, s4)
c = yigitAynimi(s5, s6)
d = yigitAynimi(s7, s8)
print a, b, c, d
