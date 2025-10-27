class Account:
    def __init__(self, initial_balance=0):
        self.__balance = initial_balance

    def deposit(self, amount):
        self.__balance += amount

    def withdraw(self, amount):
        self.__balance -= amount

    def get_balance(self):
        return self.__balance
        
class Bank:
    def __init__(self,profiles):
        self.accounts = {} # dictionary
        for i in profiles.keys() :
            self.accounts.update( { i : Account(profiles[i]) } )
    
    def transfer(self,from_who,to_who,amt):
        self.accounts[from_who].withdraw(amt)
        self.accounts[to_who].deposit(amt)
  
    def get_names_in_debt(self):
        hell = []
        for i in self.accounts.keys() :
            if self.accounts[i].get_balance() < 0 :
                hell.append(i)
        return hell
    
    def update_with_interest(self,interest_rate):
        for i in self.accounts.keys() :
            self.accounts[i].deposit(self.accounts[i].get_balance()*interest_rate/100)
