def run():
    name = str(input("Name: "))
    age = int(input("Age : "))
    year = str(2566-age)
    print(name + year[len(year)-2] + year[len(year)-1]+ "@chula.ac.th")
