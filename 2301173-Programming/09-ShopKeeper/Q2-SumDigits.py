def sum_digits(text) :
    sum = 0
    for i in text:
        if i.isnumeric():
            sum += int(i)
    return sum

def run():
    '''main program'''
    string = str(input("Enter your string: "))
    print(sum_digits(string))
