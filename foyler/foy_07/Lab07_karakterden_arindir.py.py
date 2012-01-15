import doctest
def karakterden_arindir(karakter,karakter_dizisi):
    """
    >>> karakterden_arindir('a','apple')
    pple
    >>> karakterden_arindir('a','banana')
    bnn
    >>> karakterden_arindir('z','banana')
    banana
    >>> karakterden_arindir('i','Mississippi')
    Msssspp
    """
    yeni_dizi =""
    for i in karakter_dizisi :
        if i == karakter :
            yeni_dizi += ""
        else : yeni_dizi += i
    print yeni_dizi

doctest.testmod()
            
