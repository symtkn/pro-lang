#İkilik tabandaki bir sayiyi 10'luk tabana cevirme

def baseconverter(binary):
    s=Stack()
    for i in binary:
        s.push(int(i))
    say = s.size()
    sayi=0
    
    for i in range(0,say):
        if not s.isEmpty():
            sayi+=(s.pop()*(2**i))
        else:
            break
    print sayi
        
    
baseconverter("101001")
