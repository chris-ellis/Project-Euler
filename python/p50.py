from util import primes
def p50():
    """The prime 41, can be written as the sum of six consecutive primes:
41 = 2 + 3 + 5 + 7 + 11 + 13

This is the longest sum of consecutive primes that adds to a prime below one-hundred.

The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.

Which prime, below one-million, can be written as the sum of the most consecutive primes?
    """
    p = primes(999999)
    work = p[:]
    pSet = set(p)
    bestPrime = 2
    for i in range(1,len(work)):
        for j in range(len(work)-i):
            work[j]+=p[j+i]
            if work[j] > 999999:
                break
            if work[j] in pSet:
                bestPrime = work[j]
                print bestPrime
    print bestPrime
    
p50()
