def get_dict():
    ''' สร้าง dictionary จากตารางราคา'''
    return { "Cappuccino" : { "S" : 60 , "L" : 70 } , "Espresso" : { "S" : 45 , "L" : 50 } , "Latte" : { "S" : 65 , "L" : 75 } }

def run():
    menu = get_dict()
    ''' รับชื่อเครื่องดื่ม ขนาด และ จำนวนแก้ว จากผู้ใช้แล้วคำนวณราคา'''
    drink,size,amount = str(input("Enter drink, size and number : ")).strip().split()
    if drink in menu:
        if size in menu[drink]:
            print("Total : " + str(menu[drink][size] * int(amount)))
        else:
            print("Incorrect size.")
    else:
        print("Drink not available.")
