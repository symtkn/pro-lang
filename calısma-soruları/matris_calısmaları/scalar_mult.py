def scalar_mult(n, m):
    u = len(m)
    liste = []
    for i in range(u):
        u2 = len(m[i])
        c = [0]*u2
        for j in range(u2):
            c[j] = m[i][j]*n
        liste.append(c)
    print liste
scalar_mult(4,[[3, 4, 6], [0, 12]])
