def kopyala():
    fin1 = open("kaynak_kod.py","r")
    fin2 = open("kopya.txt","w")
    for i in fin1: fin2.write(i)
    fin1.close()
    fin2.close()
