def insert_at_row(value,seq):
    if type(seq) == list:
        u = len(seq)
        liste = [0]*(u+1)
        liste[0] = value
        for i in range(u):
            liste[i+1] = seq[i]
        print liste
    elif type(seq) == str:
        dizi = ''
        dizi = value
        for i in seq:
            dizi += i
        print dizi
    else:
        seq = (value,) + seq[:]
        print seq
insert_at_row(5,[13,4])
insert_at_row('x','abc')
insert_at_row(5,(1,2,3,4,6))
