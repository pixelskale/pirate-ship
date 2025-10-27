def run():
    import math
    weight = float(input("Weight (kg.) : "))
    height = float(input("Height (m.) : "))
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
