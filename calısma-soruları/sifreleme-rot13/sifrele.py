fin1 = open('text.py','r')
fin2 = open('sifreli_text.txt','w')
okuyucu = fin1.read()
for satir in okuyucu:
    for i in satir:
        n = ord(i)-ord('a')
        m = (n+13)%26
        i = chr(ord('a')+m)
        fin2.write(i)
fin1.close()
fin2.close()
