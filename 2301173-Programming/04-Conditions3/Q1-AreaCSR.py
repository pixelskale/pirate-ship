def run():
    import math
    choice = str(input("Choose circle, square or rectangle : "))
    if choice=="circle" :
        radius = float(input("Length of the radius of the circle : "))
        print("Area is", math.pi*(radius**2))
    elif choice=="square" :
        x = float(input("Length of the side of the square : "))
        print("Area is", x**2)
    elif choice=="rectangle" :
        x,y = str(input("Length of two sides of the rectangle : ")).split(",")
        x=float(x);y=float(y);
        print("Area is", x*y)
    else:
        print("Invalid choice.")
