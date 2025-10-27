def run():
    value = str(input("Enter student ID : "))
    if (len(value)==10) and (50<=int(value[0:2])<=66) and (value[2]=='3' or value[2]=='4' or value[2]=='7') and (21<=int(value[-2:])<=28) :
        print("Valid ID")
    else:
        print("Invalid ID")
