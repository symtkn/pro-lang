def isaret_kontroL(sayi_1,sayi_2):
    if sayi_1 < 0 and sayi_2 < 0 or sayi_1 > 0 and sayi_2 > 0 : return 1
    elif sayi_1 > 0 and sayi_2 < 0 or sayi_1 < 0 and sayi_2 > 0  : return -1
    else : return 0


def kiyasLa(sayi_1,sayi_2):
    if sayi_1 > sayi_2 : return 1
    elif sayi_1 == sayi_2: return 0
    else : return -1

def fonk_geneL(fonk_adi,sayi_1,sayi_2):
    return fonk_adi(sayi_1,sayi_2)

