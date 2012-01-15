def my_csv(text):
    liste = []
    for i in text:
        i = i.split()
        for j in i:
            a = j.split(',')
            liste.append(a)
    return liste
