def sesli_sessiz(kelime):
    sesli = "aeiuoAEIOU"
    t,m = 0,0
    y_dizgi = ""
    for harf in kelime:
        if harf in sesli:
            t +=1
            y_dizgi += harf
        elif harf not in sesli :
            m +=1
            if ord(harf) >=97:
                y_harf=chr(ord(harf)-32)
                y_dizgi += y_harf
    return "sesli:" ,t, "sessiz:",m,y_dizgi
