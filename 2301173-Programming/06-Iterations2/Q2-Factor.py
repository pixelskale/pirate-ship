def run():
    n = int(input("Enter an integer : "))
    print(str(n) + " is divisible by:")
    for i in range(1, n+1) :
        if n % i == 0 :
            print(i)
