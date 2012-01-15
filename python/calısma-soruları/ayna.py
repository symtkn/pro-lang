def ayna(ch,liste):
    y_liste = []
    for i in range(len(liste)):
        if liste[i] == ch:
            y_liste.append(ch)
            y_liste[:i] = liste[i+1:]
            y_liste[i+1:] = liste[:i]
    print y_liste
ayna(6,['s',4,"ali",6,3,'derya',0])
