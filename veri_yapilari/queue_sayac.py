# -*- coding: utf-8 -*-
from queue import *
from stack import *
def  benim_adim_ne_olmali(q):
    s = Stack()
    while not q.isEmpty():
        s.push(q.deq())
    while not s.isEmpty():
        q.enq(s.pop())
    while not q.isEmpty():
        item = q.deq()
        print item
def sayac(q):
    en_son = q.ensonGelen()
    i, say = 0, 1
    while i < q.size():
        if q.deq() == en_son:
            say += 1
        else:
            continue
        i += 1
    print say
    
q = Queue()
q.enq(991)
q.enq("akilopanta")
q.enq('M.Ö')
q.enq(991)
q.enq(991)
benim_adim_ne_olmali(q)
p = Queue()
p.enq(991)
p.enq("akilopanta")
p.enq('M.Ö')
p.enq(991)
p.enq(991)
sayac(p)
    
