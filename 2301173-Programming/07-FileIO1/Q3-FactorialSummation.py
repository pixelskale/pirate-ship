import math

def f(x):
    return(1/(math.factorial(x)))
def summation(a, b):
    result = 0
    for i in range(a, b+1) :
        result+=f(i)
    return(result)
def run():
    '''main program'''
    m = int(input("Enter m: "))
    n = int(input("Enter n: "))
    if (m <= n) :
        print(round(summation(m, n), 4))
    else:
        print(round(summation(n, m), 4))
