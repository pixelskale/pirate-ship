class ShoppingCart:
    def __init__(self):
        self.cart = {}

    def add_item(self, item, qty):
        if item in self.cart :
            self.cart.update( { item : self.cart[item] + qty } )
        else:
            self.cart.update( { item : qty } )

    def remove_item(self, item, qty):
        self.cart.update( { item : self.cart[item] - qty } )
        if self.cart[item] <= 0 :
            self.cart.pop(item)

    def get_total_qty(self):
        total = 0
        for i in self.cart.values() :
            total+=i
        return total
