import re
import math

def read_file(filename):
    file = open(filename, "r")
    array = file.readlines()
    file.close()
    return array
def split_array(arrayname):
    array = arrayname
    for i in range(0,len(array)):
        array[i] = re.split("\s|\s\s|\n|\s\n", array[i])
    return array
def remove_empty_strings(array):
    for i in range(0,len(array)):
        while "" in array[i]:
            array[i].remove("")
    return(array)
def create_master(solutionarray):
    master = [[], []] # master = [[Hardest], [Easiest], Q1, Q2, ...]
    total = len(solutionarray[0])
    for i in range(0,total):
        master.append(0)
    return master,total
def check_exam(solutionlist,examlist,master,total):
    score = 0 # Individual Student Score
    for i in range(0,total):
        if solutionlist[i] == examlist[i]:
            score += 1
            master[i+2] += 1
    return master,score
def run():
    solutionfile = str(input("Choose your solution file: "))
    examfile = str(input("Choose your exam file: "))
    solutionarray = read_file(solutionfile)
    examarray = read_file(examfile)
    solutionarray = remove_empty_strings(split_array(solutionarray))
    examarray = remove_empty_strings(split_array(examarray))
    master,total = create_master(solutionarray)
    scorelist = [] # A List of All Individual Student's Score
    scorelistavg = [] # A List of All Question Score Averaged
    for i in range(0,len(examarray)):
        master,score = check_exam(solutionarray[0], examarray[i], master, total)
        scorelist.append(score)
    for i in range(0,len(master)-2):
        scorelistavg.append(master[i+2]/len(examarray)) # Assign the Average of Question Score
    print("Student score : " + str(scorelist) + "\n")
    for i in range(1,len(scorelistavg)+1):
        print("Question " + str(i) + " : " + str(scorelistavg[i-1]))
    hardest = []; easiest = []
    hardest_str = ""; easiest_str = ""
    for i in range(0,len(scorelistavg)):
        if scorelistavg[i] == min(scorelistavg):
            hardest.append(i+1)
        if scorelistavg[i] == max(scorelistavg):
            easiest.append(i+1)
    master[0] = hardest; master[1] = easiest
    for i in range(0,len(hardest)):
        if i == 0 :
            hardest_str = hardest_str + str(hardest[0])
        else:
            hardest_str = hardest_str + " " + str(hardest[i])
    for i in range(0,len(easiest)):
        if i == 0 :
            easiest_str = easiest_str + str(easiest[0])
        else:
            easiest_str = easiest_str + " " + str(easiest[i])
    print("\n" + "Hardest : " + str(hardest_str))
    print("Easiest : " + str(easiest_str))
