# -*- coding: cp1254 -*-

import math,doctest
def mutlak(sayi):
    """
    >>> mutlak(3+4j)
    5.0
    >>> mutlak(-9)
    9
    >>> mutlak(-17.5)
    17.5
    >>> mutlak(6)
    6
    >>> mutlak(4j)
    4.0
    >>> mutlak(58.0)
    58.0
    """
    if type(sayi) == str: print "Yanlış veri girdiniz"
    elif type(sayi) == complex: print math.sqrt(sayi.real**2+sayi.imag**2)
    elif type(sayi) == int:
        if sayi < 0 : print -sayi
        elif sayi >= 0 : print sayi
    elif type(sayi) == float:
        if sayi < 0 : print -sayi
        elif sayi >= 0 : print sayi
doctest.testmod()

