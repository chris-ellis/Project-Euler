def p44():
    """Pn = n(3n-1)/2
    Find the pair of pentagonal numbers, Pj and Pk, for which their sum and difference is pentagonal and D = |Pk-Pj| is minimised; what is the value of D?
    """
    p = [i*(3*i-1)/2 for i in range(1,10000)]
    pTest = set(p)
    minD = 9999999999
    for gap in range(1,len(p)):
        for i in range(len(p)-gap):
            add = p[i]+p[i+gap]
            diff = p[i+gap]-p[i]
            #print p[i],p[i+gap],add,diff
            if add in pTest and diff in pTest:
                
                if p[i+gap]-p[i] < minD:
                    minD = p[i+gap]-p[i]
                    print "***FOUND NEW ONE***"
                    
        #print "gap:", gap
    print minD
                
p44()
