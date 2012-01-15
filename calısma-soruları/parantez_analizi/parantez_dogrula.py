fin = open('parantezler.txt','r')
for satir in fin:
    liste = list(satir)
    ac_parantez,kapa_parantez = 0,0
    for ch in liste:
        if ch == '(':
            ac_parantez += 1
        elif ch == ')':
            kapa_parantez += 1
    if ac_parantez == kapa_parantez:
        for i in range(len(liste)):
            if liste[i] == ')':
                if '(' in liste[:i]:
                    continue
        print True
    else : print False
fin.close()
