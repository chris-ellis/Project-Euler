
def p42():
    """The nth term of the sequence of triangle numbers is given by, t_n = 0.5*n(n+1); so the first ten triangle numbers are:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

By converting each letter in a word to a number corresponding to its alphabetical position and adding these values we form a word value. For example, the word value for SKY is 19 + 11 + 25 = 55 = t_(10). If the word value is a triangle number then we shall call the word a triangle word.

Using words.txt (right click and 'Save Link/Target As...'), a 16K text file containing nearly two-thousand common English words, how many are triangle words?
    """
    infile = open('words.txt')
    inStr = infile.readline()
    infile.close()
    words = inStr.split(",")
    words = [wordScore(word[1:-1]) for word in words]
    
    total = 0
    maxWord = max(words)
    t = 1
    i = 1
    while t < maxWord:
        total += words.count(t)
        i += 1
        t = (i*(i+1))/2
    print total
    
def wordScore(word):
    score = 0
    myWord = word.lower()
    for cha in myWord:
        score += ord(cha)-96
    return score
    

p42()
