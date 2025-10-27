def get_dict():
    '''สร้าง dictionary ของค่าเทอม แล้วคืนค่า dictionary'''
    hell = {
        "group1" : {'Bachelor': {'S1_2': {'ID_1': 16000, 'ID_2': 18000, 'ID_3': 21000}, 'S3': {'ID_1': 4000, 'ID_2': 4500, 'ID_3': 5250}}, 'Graduate': {'S1_2': {'ID_1': 22500, 'ID_2': 26000, 'ID_3': 31000}, 'S3': {'ID_1': 6000, 'ID_2': 7000, 'ID_3': 7750}}},
        "group2" : {'Bachelor': {'S1_2': {'ID_1': 12000, 'ID_2': 14500, 'ID_3': 17000}, 'S3': {'ID_1': 4000, 'ID_2': 4500, 'ID_3': 5250}}, 'Graduate': {'S1_2': {'ID_1': 16500, 'ID_2': 19000, 'ID_3': 23000}, 'S3': {'ID_1': 6000, 'ID_2': 7000, 'ID_3': 7750}}},
    }
    return hell

def run():
    '''รับเลขประจำตัวนิสิต ตรวจสอบ และแสดงค่าเทอม'''
    code = str(input("Enter student ID : "))
    valid = True
    if len(code)==10:
        if code[2] in ["3", "4"]:
            rank = "Bachelor"
        elif code[2] in ["7"]:
            rank = "Graduate"
        else:
            valid = False
        if code[-2:] in ["21", "23", "25", "28", "30", "31", "32", "33", "35", "36", "37", "38", "39", "53"]:
            group = "group1"
        elif code[-2:] in ["22", "24", "26", "27", "29", "34", "40", "51"]:
            group = "group2"
        else:
            valid = False
        if int(code[0:2]) in range(48, 50):
            year = "ID_1"
        elif int(code[0:2]) in range(50, 56):
            year = "ID_2"
        elif int(code[0:2]) >= 56:
            year = "ID_3"
        else:
            valid = False
        if valid == True :
            semester = str(input("Enter semester : "))
            if semester in ["1", "2"]:
                enroll = "S1_2"
            elif semester in ["3"]:
                enroll = "S3"
            else:
                valid = False
            if valid == True:
                hell = get_dict()
                print("Registration fee : " + str(hell[group][rank][enroll][year]))
            else:
                print("Invalid semester")
        else:
            print("Invalid ID")
    else:
        print("Invalid ID")
