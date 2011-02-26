def primes(n): 
	if n==2: return [2]
	elif n<2: return []
	s=range(3,n+1,2)
	mroot = n ** 0.5
	half=(n+1)/2-1
	i=0
	m=3
	while m <= mroot:
		if s[i]:
			j=(m*m-3)/2
			s[j]=0
			while j<half:
				s[j]=0
				j+=m
		i=i+1
		m=2*i+3
	return [2]+[x for x in s if x]
	
def isNPandigital(n):
    nStr = str(n)
    count = [0,0,0,0,0,0,0,0,0,0]
    for i in range(len(nStr)):
        count[int(nStr[i])]+=1
        
    for i in range(len(nStr)):
        if count[i+1] != 1:
            return False
    #print count
    return True

def is09Pandigital(n):
    nStr = str(n)
    if len(nStr) != 10:
        return False
    count = [0,0,0,0,0,0,0,0,0,0]
    for i in range(10):
        count[int(nStr[i])]+=1
        
    for i in range(10):
        if count[i] != 1:
            return False
    #print count
    return True
