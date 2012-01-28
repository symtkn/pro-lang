def rot13(kelime):
    alfabe='ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    bulucu=0
    liste1=list(alfabe)
    liste2=list(kelime)

    while bulucu < len(kelime):
        sira=alfabe.find(liste2[bulucu])
        if sira >= 13:
            artan=(sira+13)%13
            liste2[bulucu]=liste1[artan]
            bulucu +=1
            rot=''.join(liste2)

        else:
            liste2[bulucu]=liste1[sira+13]
            bulucu +=1

            rot=''.join(liste2)

    return rot
