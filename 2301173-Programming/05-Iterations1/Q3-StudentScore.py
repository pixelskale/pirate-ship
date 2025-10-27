def run():
    valid = False
    counter = str(input("Number of students : "))
    while not valid:
        try:
            counter = int(counter)
            if counter >= 0:
                valid = True
            else:
                counter = str(input("Incorrect Input. Number of students : "))
        except ValueError:
            counter = str(input("Incorrect Input. Number of students : "))
    total = 0.0
    for i in range(1, counter+1) :
        score = float(input("Student " + str(i) + " : "))
        total+=score
    print("Total score : " + str(total))
