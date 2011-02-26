def p45():
    """It can be verified that T_(285) = P_(165) = H_(143) = 40755.

Find the next triangle number that is also pentagonal and hexagonal.
    """
    ti = 286
    pi = 166
    hi = 144
    t = ti*(ti+1)/2
    p = pi*(3*pi-1)/2
    h = hi*(2*hi-1)
    while t != p or p != h or t != h:
        if t <= p and t <= h:
            ti += 1
            t = ti*(ti+1)/2
        elif p <= t and p <= h:
            pi += 1
            p = pi*(3*pi-1)/2
        elif h <= p and h <= t:
            hi += 1
            h = hi*(2*hi-1)
        else:
            print "huh?"
        #print "t, p, h : ",t, p, h    
        #print "ti,pi,hi: ",ti, pi, hi
    print t,p,h

    
p45()
