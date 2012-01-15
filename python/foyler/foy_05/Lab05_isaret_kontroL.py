import doctest
def isaret_kontroL(sayi_1,sayi_2):
    """
    >>> isaret_kontroL(9,4)
    1
    >>> isaret_kontroL(6,0)
    0
    >>> isaret_kontroL(3,-13)
    -1
    """
    if sayi_1 < 0 and sayi_2 < 0 or sayi_1 > 0 and sayi_2 > 0 : return 1
    elif sayi_1 > 0 and sayi_2 < 0 or sayi_1 < 0 and sayi_2 > 0  : return -1
    else : return 0
doctest.testmod()
