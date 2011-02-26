def irrnum(n):
    """An irrational decimal fraction is created by concatenating the positive integers:
    0.123456789101112131415161718192021...
    It can be seen that the 12^(th) digit of the fractional part is 1.
    If d_(n) represents the n^(th) digit of the fractional part, find the value of the following expression.
    d1 x d10 x d100 x d1000 x d10000 x d1000000"""
    digit = n
    len = 1
    numLen = [0,9,180,2700,36000,450000,5400000]
    num = 1
    #print "n = ", n
    
    # skip past all the lengths of number we dont want
    while digit >= numLen[len]:
        digit -= numLen[len]
        num *= 10
        len += 1    
    #print "len = ", len
    
    # find the number we do want
    step = (digit-1) / len
    digit -= step * len    
    num += step
    #print "step = ",step
    # find the digit of the number
    strnum = str(num)
    #print "d = ", int(strnum[digit-1])
    return int(strnum[digit-1])
    
def p40():
    print irrnum(1)*irrnum(10)*irrnum(100)*irrnum(1000)*irrnum(10000)*irrnum(100000)*irrnum(1000000)

