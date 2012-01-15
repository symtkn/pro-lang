import quiz
okunacak_dosya = ('firmalar.csv','r')
dosya_tutacagi = open('firmalar.csv')
okuyucu = quiz.my_csv(dosya_tutacagi)
sira = 1
for satir in okuyucu:
    print 'firma no :',sira
    print ' firma adi :',satir[0]
    print ' firma turu  :',satir[1]
    print ' ulke :',satir[2]
    sira += 1
dosya_tutacagi.close()
