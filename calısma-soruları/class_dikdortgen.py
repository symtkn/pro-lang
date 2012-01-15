class nokta:
    def __init__(p,en=5,boy=3):
        p.x = en
        p.y = boy
class dikdortgen:    
    def __init__(d):
        d.p1 = nokta()
        d.p2 = nokta()
    
    def ciz(d):
        dizi = ""
        for i in range(d.p1.x):
            dizi = dizi + '#'
        for j in range(d.p1.y):
            print dizi
    
