from util import *

def p49():
    """The arithmetic sequence, 1487, 4817, 8147, in which each of the terms increases by 3330, is unusual in two ways: (i) each of the three terms are prime, and, (ii) each of the 4-digit numbers are permutations of one another.

There are no arithmetic sequences made up of three 1-, 2-, or 3-digit primes, exhibiting this property, but there is one other 4-digit increasing sequence.

What 12-digit number do you form by concatenating the three terms in this sequence?

    """
    p = primes(9999)
    p = [n for n in p if n > 999]
    
    perm = dict()
    for n in p:
        key = "".join(sorted(str(n)))
        if not perm.has_key(key):
            perm[key] = []
        perm[key].append(n)
    for (key, val) in perm.items():
        if len(val) >= 3:
            for i in range(len(val)):
                for j in range(i+1,len(val)):
                    for k in range(j+1,len(val)):
                        if (val[j] - val[i] == val[k] - val[j]):
                            print val[i],val[j],val[k]
            
    return perm
    
    
def genPerms():
    pass
    
p49()
