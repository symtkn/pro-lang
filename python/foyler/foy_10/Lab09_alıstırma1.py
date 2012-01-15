fin = open('sozcuk.txt')
for satir in fin:
    if len(satir) >= 6:
        print satir.strip()
    else : pass
