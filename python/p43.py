def p43():
    """The number, 1406357289, is a 0 to 9 pandigital number because it is made up of each of the digits 0 to 9 in some order, but it also has a rather interesting sub-string divisibility property.

Let d_(1) be the 1^(st) digit, d_(2) be the 2^(nd) digit, and so on. In this way, we note the following:

    * d_(2)d_(3)d_(4)=406 is divisible by 2
    * d_(3)d_(4)d_(5)=063 is divisible by 3
    * d_(4)d_(5)d_(6)=635 is divisible by 5
    * d_(5)d_(6)d_(7)=357 is divisible by 7
    * d_(6)d_(7)d_(8)=572 is divisible by 11
    * d_(7)d_(8)d_(9)=728 is divisible by 13
    * d_(8)d_(9)d_(10)=289 is divisible by 17

Find the sum of all 0 to 9 pandigital numbers with this property.
    """
    total = 0
    for i in range(3628800):
        perm = genPanPerm(i)
        if (checkDivis(perm)):
            total += int(perm)
    print total 
            
def checkDivis(n):
    if len(n) != 10:
        return False
    prime = [2,3,5,7,11,13,17]
    for i in range(7):
        if int(n[1+i:4+i])%prime[i]>0:
            return False
    return True
    
def genPanPerm(perm): # this runs pretty slowly, oughtta use a better permutation generator
    fac = [1, 2, 6, 24, 120, 720, 5040, 40320, 362880]
    num = ''
    left = '0123456789'
    for i in range(len(fac)-1, -1, -1):
        which = 0
        while fac[i] <= perm:
            perm -= fac[i]
            which += 1
        num += left[which]
        left = left[0:which] + left[which+1:len(left)]
    num += left
    return num

   
p43()
