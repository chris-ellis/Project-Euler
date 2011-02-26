def p48():
    total = 0
    for i in range(1,1001):
        total += i**i
    total = str(total)
    print total[:]
    
p48()
