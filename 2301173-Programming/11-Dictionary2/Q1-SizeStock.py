def get_dict(file_name):
    '''สร้าง dictionary ของรหัสและจำนวนสินค้า คืนค่าเป็น dictionary'''
    file = open(file_name, "r")
    hell = dict()
    for i in file.readlines():
        code,size,amount = i.strip().split()
        if not int(code) in hell:
            hell.update( { int(code) : { str(size) : int(amount) } } )
        else:
            if not str(size) in hell[int(code)]:
                pain = hell[int(code)]
                pain.update( { str(size) : int(amount) } )
                hell.update( { int(code) : pain } )
            else:
                pain = hell[int(code)]
                blood = hell[int(code)][str(size)]
                pain.update( { str(size) : (int(amount)+blood) } )
                hell.update( { int(code) : pain } )
    file.close()
    return hell
