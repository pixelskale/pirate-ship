def add_item(item_list) :
    item = str(input("Enter item: "))
    if item in item_list:
        print("Item is already in the list")
    else:
        item_list.append(item)
        print("Item has been added")
    return item_list
    
def change_item(item_list) :
    item = str(input("Enter item you want to change: "))
    if item in item_list:
        ichange = str(input("Enter new item: "))
        item_list = list(map(lambda x: x.replace(item, ichange), item_list))
        print("Item has been changed")
    else:
        print("Item is not in the list")
    return item_list

def insert_item(item_list) :
    item = str(input("Enter item: "))
    location = int(input("Enter location that you want to insert: "))
    item_list.insert(location, item)
    print("Item has been inserted")
    return item_list

def remove_item(item_list) :
    item = str(input("Enter item you want to remove: "))
    if item in item_list:
        item_list.remove(item)
        print("Item has been removed")
    else:
        print("This item is not in the list")
    return item_list

def show_item(item_list) :
    if len(item_list) == 0:
        print("The list is currently empty")
    else:
        print(item_list)

def run():
    '''main program'''
    running = True
    item_list = []
    print("What would you like to do?")
    print("1: add item")
    print("2: change item")
    print("3: insert item")
    print("4: remove item")
    print("5: show items")
    print("6: exit")
    while running == True:
        number = int(input("Enter a number: "))
        if number == 1:
            item_list = add_item(item_list)
        elif number == 2:
            item_list = change_item(item_list)
        elif number == 3:
            item_list = insert_item(item_list)
        elif number == 4:
            item_list = remove_item(item_list)
        elif number == 5:
            show_item(item_list)
        elif number == 6:
            running = False
        else:
            print("Invalid Argument, please try again.")
