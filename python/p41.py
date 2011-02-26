from util import *
def p41():
    """We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once. For example, 2143 is a 4-digit pandigital and is also prime.

    What is the largest n-digit pandigital prime that exists?
    """
    pList = primes(7654321)
    pList = [p for p in pList if p > 1234567]
    print(len(pList))
    for i in range(len(pList)-1, -1, -1):
        if isPandigital(pList[i]):
            print pList[i]
            break
            
p41()
