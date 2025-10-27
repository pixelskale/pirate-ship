def get_dict(file_name):
    '''สร้างและคืนค่า dictionary จากการอ่านไฟล์'''
    file = open(file_name, "r")
    hell = dict()
    for i in file.readlines():
        cu,k1,k2,k3,npc = i.strip().split()
        score = int(k1) + int(k2) + int(k3) + int(npc)
        hell.update( { str(cu) : int(score) } )
    return hell

def find_top3(scores):
    '''คืน list ของผู้มีคะแนนสูงสุดการประกวด 3 อันดับแรก'''
    hell = dict(scores)
    sauce = sorted(hell.items(), key=lambda x:x[1], reverse = True)
    return [sauce[0][0], sauce[1][0], sauce[2][0]]

def run():
    '''รับชื่อไฟล์คะแนน แล้วแสดง list ของผู้ชนะ 3 ลำดับแรก'''
    x = input("Input file_name :")
    scores = get_dict(x)
    print('The winners are :')
    print(find_top3(scores))
