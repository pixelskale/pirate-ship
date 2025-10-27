def get_dict(file_name):
    ''' สร้าง dictionary จากไฟล์ file_name'''
    file = open(file_name, "r")
    hell = dict()
    pain = file.read().strip().split()
    for i in range(len(pain)):
        pain[i] = pain[i].replace(":", "").replace("?", "").replace(",", "").replace(".", "")
    for i in pain :
        if i in hell :
            hell[i] += 1
        else:
            hell.update( { i : 1} )
    file.close()
    return hell
