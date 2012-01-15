class nokta:
    def __init__(p,x = 3,y = 5):
        p.x = x
        p.y = y
class gece:
    def __init__(d):
        d.p1 = nokta()
        d.p2 = nokta()
    def transpoze(d):
        y_dp2 = d.p2.y
        d.p2.y = d.p1.x
        d.p1.x = y_dp2
    def ciz(d):
        k = ''
        for i in range(d.p1.x):
            k = k + '#'
            
        for i in range(d.p2.y):
            print k
        
