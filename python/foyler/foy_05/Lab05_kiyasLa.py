import doctest
def kiyasLa(sayi_1,sayi_2):
    """
    >>> kiyasLa(9,4)
    1
    >>> kiyasLa(6,6)
    0
    >>> kiyasLa(3,13)
    -1
    """
    if sayi_1 > sayi_2 : return 1
    elif sayi_1 == sayi_2: return 0
    else : return -1
doctest.testmod()    
    
