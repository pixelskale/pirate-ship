def create_list(number):
    mylist = []
    for i in range(1,101):
        if str(number) in str(i):
            mylist.append(i)
    return mylist

def run():
    number = int(input("Enter a number between [0,9]: "))
    print(create_list(number))
