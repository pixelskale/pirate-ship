def run():
    import math
    weight,wunit = str(input("Weight : ")).split()
    height,hunit = str(input("Height : ")).split()
    weight=float(weight);height=float(height)
    if wunit=="kg" :
        pass
    elif wunit=="lbs" :
        weight/=2.205
    if hunit=="m" :
        pass
    elif hunit=="cm" :
        height/=100
    elif hunit=="ft" :
        height/=3.2808399
    bmi = weight/(height**2)
    if bmi < 18.5 :
        print("ผอม")
    elif 18.5 <= bmi < 23.0 :
        print("รูปร่างปกติ")
    elif 23.0 <= bmi < 25.0 :
        print("รูปร่างอ้วน")
    elif 25.0 <= bmi < 30.0 :
        print("อ้วนระดับ 1")
    elif 30.0 <= bmi :
        print("อ้วนระดับ 2")
