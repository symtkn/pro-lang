def sesli_harf_sayisi(liste):
    sesli = "AaEeIiOoUu"
    k = 0
    sesli_listesi = []
    for kelime in liste:
        for harf in kelime:
            if harf in sesli:
                if harf not in sesli_listesi:
                    sesli_listesi.append(harf)
            else:pass
    for i in range(len(sesli_listesi)):
        for t in liste:
            for h in t:
                if h == sesli_listesi[i]:
                    k += 1 
        print sesli_listesi[i],":",k
        k = 0
sesli_harf_sayisi(['seyma','tekin','bmb'])
