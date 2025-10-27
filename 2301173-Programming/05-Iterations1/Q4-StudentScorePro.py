def run():
    valid = False
    counter = str(input("Number of students : "))
    while not valid:
        try:
            counter = int(counter)
            if counter > 0:
                valid = True
            else:
                counter = str(input("Incorrect Input. Number of students : "))
        except ValueError:
            counter = str(input("Incorrect Input. Number of students : "))
    total = 0.0
    totalpass = 0.0
    counterpass = 0
    totalfail = 0.0
    counterfail = 0
    highscore = 0.0
    for i in range(1, counter+1) :
        score = float(input("Student " + str(i) + " : "))
        total+=score
        if score >= 5 :
            totalpass+=score
            counterpass+=1
        else:
            totalfail+=score
            counterfail+=1
        if score > highscore :
            highscore = score
    print("Average score : " + str(total/counter))
    if counterpass == 0 :
        print("Average passing score : " + "No student passed")
    else:
        print("Average passing score : " + str(totalpass/counterpass))
    if counterfail == 0 :
        print("Average failing score : " + "No student failed")
    else:
        print("Average failing score : " + str(totalfail/counterfail))
    print("Highest score : " + str(highscore))
