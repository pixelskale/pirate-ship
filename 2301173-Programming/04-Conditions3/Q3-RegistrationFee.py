def run():
    value = str(input("Enter student ID : "))
    if (len(value)==10) and (50<=int(value[0:2])<=66) and (value[2]=='3' or value[2]=='4' or value[2]=='7') and (21<=int(value[-2:])<=28) :
        semester = str(input("Enter semester : "))
        if (semester=='1' or semester=='2' or semester=='3') :
            if (value[2]=='3' or value[2]=='4') :
                undergraduate = True
            else:
                undergraduate = False
            if (value[-2:]=='21' or value[-2:]=='23' or value[-2:]=='25' or value[-2:]=='28') :
                former = True
            else:
                former = False
            if (50<=int(value[0:2])<=55) :
                if (semester=='1' or semester=='2') and undergraduate and former :
                    print("Registration fee : 18000")
                elif (semester=='1' or semester=='2') and not undergraduate and former :
                    print("Registration fee : 26000")
                elif (semester=='1' or semester=='2') and undergraduate and not former :
                    print("Registration fee : 14500")
                elif (semester=='1' or semester=='2') and not undergraduate and not former :
                    print("Registration fee : 19000")
                elif (semester=='3') and undergraduate :
                    print("Registration fee : 4500")
                elif (semester=='3') and not undergraduate :
                    print("Registration fee : 7000")
            else:
                if (semester=='1' or semester=='2') and undergraduate and former :
                    print("Registration fee : 21000")
                elif (semester=='1' or semester=='2') and not undergraduate and former :
                    print("Registration fee : 31000")
                elif (semester=='1' or semester=='2') and undergraduate and not former :
                    print("Registration fee : 17000")
                elif (semester=='1' or semester=='2') and not undergraduate and not former :
                    print("Registration fee : 23000")
                elif (semester=='3') and undergraduate :
                    print("Registration fee : 5250")
                elif (semester=='3') and not undergraduate :
                    print("Registration fee : 7750")
        else:
            print("Invalid semester")
    else:
        print("Invalid ID")
