import re

def is_equal(v1,v2):
    return True if len(v1) == len(v2) else False
def dot(v1,v2):
    result = 0.0
    for i in range(0,len(v1)):
        result = result + (v1[i]*v2[i])
    return result
def remove_empty_strings(v):
    while "" in v:
        v.remove("")
    return(v)
def convert_to_float(v):
    v = [float(i) for i in v]
    return(v)
def read_file_vectors(filename):
    vectorfile = open(filename, "r")
    vectorarray = vectorfile.readlines()
    vectorfile.close()
    vectorarray[0] = re.split("\s|\s\s|\n", vectorarray[0])
    vectorarray[1] = re.split("\s|\s\s|\n", vectorarray[1])
    for i in range(0,len(vectorarray)):
        vectorarray[i] = remove_empty_strings(vectorarray[i])
    vectorarray = tuple(vectorarray)
    return vectorarray
def run():
    vectorarray = read_file_vectors(str(input("Choose your vector file: ")))
    v1 = vectorarray[0]
    v2 = vectorarray[1]
    v1,v2 = convert_to_float(v1),convert_to_float(v2)
    print("v1 = " + str(v1))
    print("v2 = " + str(v2))
    if is_equal(v1,v2):
        print("v1*v2 = " + str(dot(v1,v2)))
    else:
        print("Incompatible size")
