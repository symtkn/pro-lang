# -*- coding: cp1254 -*-
##!/usr/bin/python
def bosluk_birak_tekrarla(sozluk,bosluk_uzunlugu,tekrar_sayisi):
    """
    Bu bir doctest örneğidir.
    >>>bosluk_birak_tekrarla("seyma",5,3)
    seyma     seyma     seyma
    """
    a=sozluk
    b=bosluk_uzunlugu
    c=tekrar_sayisi
    print(a+b*" ")*c
