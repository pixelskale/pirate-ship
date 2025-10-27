def run():
    price = float(input("Price: "))
    shipping = float(input("Shipping: "))
    total = price + shipping
    print("Total: " + str(total) + " Baht (" + str(shipping) + " Baht shipping fee)")
