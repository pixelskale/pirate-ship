def get_dict():
    ''' สร้าง dictionary จากตาราง'''
    return { "2301117" : ("Calculus I", "4") , "2301118" : ("Calculus II", "4") , "2301286" : ("Probability and Statistics", "3") , "2301399" : ("Project Proposal", "1") , "2301499" : ("Senior Project", "2") , "2302113" : ("General Chemistry Lab I", "1") , "2302161" : ("General Chemistry", "3") }
def run():
    subject = get_dict()
    ''' วนรับรหัสรายวิชาจากผู้ใช้ และหาชื่อรายวิชาและหน่วยกิตแสดงเป็นผลลัพธ์ (เลิกวนรับเมื่อรหัสเป็น 0)'''
    while True:
        code = str(input("Course ID: "))
        if code in subject:
            print(subject[code][0], subject[code][1])
        elif code == "0":
            break
        else:
            print("Unknown")
