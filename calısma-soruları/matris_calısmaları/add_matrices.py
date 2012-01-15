import doctest
def add_matrices(a,b):
    '''
    >>> a = [[1, 2], [3, 4]]
    >>> b = [[2, 2], [2, 2]]
    >>> add_matrices(a,b)
    [[3, 4], [5, 6]]
    >>> a
    [[1, 2], [3, 4]]
    '''
    liste = []
    u = len(a)
    for i in range(u):
        u = len(a[i])
        c = [0]*u
        m = 0
        for j in range(u):
            c[m] = a[i][j] + b[i][j]
            m += 1
        liste.append(c)
    print liste
doctest.testmod()
