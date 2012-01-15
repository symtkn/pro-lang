import doctest
def myupper(kelime):
    """\
    >>> myupper("seyma")
    'SEYMA'
    """
    for i in kelime:
        upper_kelime = ""
        if 122 >= ord(i) >= 97:
            upper_kelime += chr(ord(i)-32)
        else : upper_kelime += i
        print upper_kelime
doctest.testmod()

        
            
