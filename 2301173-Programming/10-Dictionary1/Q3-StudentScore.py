def get_dict(file_name):
    ''' สร้าง dictionary จากไฟล์ file_name'''
    file = open(file_name, "r")
    hell = dict()
    for i in file.readlines():
        pain = i.strip().split()
        hell.update( { pain[0] : int(pain[1]) } )
    file.close()
    return hell

def run():
    ''' รับชื่อไฟล์ที่มีรายชื่อนักเรียนและคะแนนสอบ แล้วแสดงชื่อนักเรียนเรียงจากคะแนนสูงสุดไปต่ำสุด กำหนดให้ ไม่มีใครได้คะแนนเท่ากัน'''
    file_name = str(input("Choose your studentScore: "))
    hell = get_dict(file_name)
    sauce = sorted(hell.items(), key=lambda x:x[1], reverse = True)
    for i in sauce :
        print(i[0])
