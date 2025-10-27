def run():
    import math
    a,b,c = str(input("Length of 3 sides: ")).split(",")
    a=float(a);b=float(b);c=float(c);
    if(a+b>c and a+c>b and b+c>a):
        if(a**2+b**2==c**2 or a**2+c**2==b**2 or b**2+c**2==a**2):
            print("Right triangle: True")
        else:
            print("Right triangle: False")
    else:
        print("Right triangle: False")
