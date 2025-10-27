def run():
    x,y = str(input("x,y : ")).split(",")
    x=int(x);y=int(y);
    if (x==10 and y==0) or (x==0 and y==20) :
        print(f"( {x} , {y} ) is in D")
    elif 0<=x<=10 and 0<=y<=20 :
        if (x==0) or (y==0) :
            print(f"( {x} , {y} ) is in B")
        elif (x==10) or (y==20) :
            print(f"( {x} , {y} ) is in A")
        else :
            print(f"( {x} , {y} ) is in C")
    elif -40<=x<=10 and -20<=y<=20 :
        print(f"( {x} , {y} ) is in B")
    elif 0<=x<=40 and 0<=y<=40 :
        print(f"( {x} , {y} ) is in A")
    else :
        print(f"( {x} , {y} ) is in D")
