from util import *

def p47():
    """

Find the first four consecutive integers to have four distinct primes factors. What is the first of these numbers?

    """
    prime = primes(1000000)
    num = [1,2,3,4]
    found = False
    while not found:
        num = [n+1 for n in num]
        found = True
        for i in range(4):
            pfactors = set()
            tmp = num[i]
            #print "***",tmp,"***"
            p = 0
            while prime[p] <= tmp and tmp > 1:
                while tmp % prime[p] == 0:
                    tmp /= prime[p]
                    #print prime[p],tmp
                    pfactors.add(prime[p])
                p += 1
            if len(pfactors) != 4:
                found = False
                break

    print num    
        
p47()
