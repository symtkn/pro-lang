def insert_at_end(value,seq):
    if type(seq) == list:
        u = len(seq)
        liste = [0]*(u+1)
        for i in range(u):
            liste[i] = seq[i]
        liste[-1] = value
        print liste
    elif type(seq) == str:
        seq = seq + value
        print seq
    else :
        seq = seq[:] + (value,)
        print seq
insert_at_end(5,[1,3])
insert_at_end('x','abc')
insert_at_end(5,(1,2,3,6))
