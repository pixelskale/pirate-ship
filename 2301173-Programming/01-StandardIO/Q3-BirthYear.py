def run():
    full = str(input("Name, age: ")).split()
    print(full[0] + "\'s year of birth is " + str(2566-int(full[1])) + ".")
