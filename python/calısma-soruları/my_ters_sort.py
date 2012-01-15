def my_ters_sort(liste):
    dizi = ""
    y_liste = []
    for i in range(len(liste)):
        m = max(liste)
        liste.remove(m)
        y_liste.append(m)
    print y_liste[:]
my_ters_sort([1,2,6,45,0])
