def run():
    lasttemp = 0.0
    for i in range(1, 8) :
        temp = float(input("Day " + str(i) + " : "))
        if i == 1 :
            lasttemp = temp
        if temp < lasttemp :
            print("Temperature dropped on day " + str(i))
        lasttemp = temp
