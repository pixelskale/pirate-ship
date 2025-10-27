def run():
    balance = 50000.0
    while balance > 0 :
        withdraw = float(input("withdraw : "))
        if withdraw > balance :
            print("Insufficient fund.")
        else:
            balance = balance - withdraw
    print("Balance is 0")
