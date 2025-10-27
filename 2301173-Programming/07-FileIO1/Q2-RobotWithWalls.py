def run():
    movefile = open(str(input("Choose your movefile: ")), "r")
    x,y = str(input("Initial position : ")).split(",")
    x = int(x); y = int(y)
    if (-9 <= x <= 9) and (-9 <= y <= 9) :
        valid = True
        movearray = movefile.readlines()
        for command in movearray :
            if (command == "L" or command == "L\n") :
                if x != -9 :
                    x-=1
            elif (command == "R" or command == "R\n") :
                if x != 9 :
                    x+=1
            elif (command == "D" or command == "D\n") :
                if y != -9 :
                    y-=1
            elif (command == "U" or command == "U\n") :
                if y != 9 :
                    y+=1
            else:
                valid = False
        if valid == True :
            print("Robot stops at " + str(x) + "," + str(y))
        else:
            print("Invalid command")
    else:
        print("Invalid command")
    movefile.close()
