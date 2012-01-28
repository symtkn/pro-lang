nokta=input("Nokta sayisi: ")
nd=range(nokta)

def birlestir(p,q):
    ilk=nd[p]
    for i in range(len(nd)):
        if nd[i]==ilk:
            nd[i]=nd[q]

def bul(p,q):
    return nd[p]==nd[q]

print nd
birlestir(3,4)
print "3-4 =>", nd
birlestir(4,9)
print "4-9 =>",nd
birlestir(8,0)
print "8-0 =>",nd
birlestir(2,3)
print "2-3 =>",nd
birlestir(5,6)
print "5-6 =>",nd
birlestir(5,9)
print "5-9 =>",nd
birlestir(7,3)
print "7-3 =>",nd
birlestir(4,8)
print "4-8 =>",nd
birlestir(6,1)
print "6-1 =>",nd

print "0-2 ?", bul(0,2)
print "4-10 ?", bul(4,10)
