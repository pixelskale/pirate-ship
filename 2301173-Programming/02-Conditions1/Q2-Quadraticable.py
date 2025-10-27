def run():
    import math
    a,b,c = str(input("Enter coefficients a, b, c : ")).split(",")
    a=float(a);b=float(b);c=float(c);
    discriminant = (b**2)-(4*a*c)
    if(a==0 or discriminant<0):
        print("Can use quadratic formula: False")
    else:
        print("Can use quadratic formula: True")
