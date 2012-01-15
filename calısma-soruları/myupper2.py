import doctest
def myupper2(kelime):
    """\
    >>> myupper2("seyma")
    'SEYMA'
    """
    for i in kelime:
        n=kelime.find(i)
        if 65 <= ord(i) <=90:
            continue
        elif 122 >= ord(i) >= 97:
            k= chr(ord(i)-32)
            kelime = kelime[:n]+ k +kelime[n+1:]
    return kelime        
doctest.testmod()

        
            
