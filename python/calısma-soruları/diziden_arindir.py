import doctest
def diziden_arindir(kisa_dizi,uzun_dizi):
    """
    >>> diziden_arindir('an','banana')
    ba
    >>> diziden_arindir('cyc','bicycle')
    bile
    >>> diziden_arindir('iss','Mississippi')
    Mippi
    >>> diziden_arindir('eggs','bicycle')
    bicycle
    """
    yeni_dizi = ""
    uzunluk = len(kisa_dizi)
    for kisa_dizi in uzun_dizi :
        sira = uzun_dizi.find(kisa_dizi)
        yeni_dizi += uzun_dizi[:sira] + uzun_dizi[sira + uzunluk:]
        uzun_dizi = yeni_dizi
    print uzun_dizi    
doctest.testmod()
