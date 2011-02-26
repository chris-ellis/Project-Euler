from util import *

def p46():
    """
    It was proposed by Christian Goldbach that every odd composite number can be written as the sum of a prime and twice a square.

It turns out that the conjecture was false.

What is the smallest odd composite that cannot be written as the sum of a prime and twice a square?
    """
    maxNum = 100000
    p = primes(maxNum)
    pSet = set(p)
    oc = range(3,maxNum+1,2)
    oc = [num for num in oc if num not in pSet]
    for num in oc:
        sq = 1
        found = False
        while sq*sq < num:
            
            if num-2*sq*sq in pSet:
                found = True
                break
            sq += 1
        if not found:
            print "Found:", num
            break
    
        

    
p46()
