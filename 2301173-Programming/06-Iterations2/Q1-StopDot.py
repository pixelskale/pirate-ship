def run():
    sentence = ""
    while True :
        word = str(input("Next word : "))
        if word == "." :
            break
        sentence = sentence + " " + word
    print("Sentence:" + sentence)
