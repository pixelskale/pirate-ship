def run():
    counter = 0
    name = str(input("Enter username : "))
    while name != "Lisa" and counter != 2:
        name = str(input("Incorrect. Enter again : "))
        counter+=1
    if name == "Lisa" :
        print("Hello, " + name)
    else:
        print("Not allowed. Incorrect name.")
