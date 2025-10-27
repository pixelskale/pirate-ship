def run():
    import math
    a,b,c = str(input("Enter coefficients a, b, c : ")).split(",")
    a=float(a);b=float(b);c=float(c);
    discriminant = (b**2)-(4*a*c)
    if(a==0 or discriminant<0):
        print("Invalid Input, The Discriminant must be positive.")
    else:
        x1 = (-(b)+(math.sqrt(discriminant)))/(2*a)
        x2 = (-(b)-(math.sqrt(discriminant)))/(2*a)
        print("x = " + str(x1) + " , " + str(x2))
