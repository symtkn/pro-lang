def ek_satir_kolon(liste):
    for i in range(len(liste)):
        liste[i].append(liste[i][-1])
        liste[i].insert(0,liste[i][0])
    liste.append(liste[-1])
    liste.insert(0,liste[0])
    print liste
        
