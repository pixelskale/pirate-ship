def run():
    import math
    a,b,c = str(input("Length of 3 sides: ")).split(",")
    a=float(a);b=float(b);c=float(c);
    if(a+b>c and a+c>b and b+c>a):
        print("Triangle: True")
    else:
        print("Triangle: False")
