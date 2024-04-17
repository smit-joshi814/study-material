'''
Person - name,code
Account -> person + pay
Admin -> person + experience
Master -> Account & Admin
'''

class Person():
    def __init__(self,name,code):
        self.name=name
        self.code=code

class Account(Person):
    def __init__(self, name, code,pay):
        # super().__init__(self,name,code)  -- Error
        Person.__init__(self,name, code)
        self.pay=pay

class Admin(Person):
    def __init__(self,name,code,experience):
        # super().__init(name,code)     -- Error
        Person.__init__(self,name,code)
        self.experience=experience

class Master(Account,Admin):
    def __init__(self, name, code, pay,experience):
        # super().__init__(name,code,pay,experience)    --Error
        Account.__init__(self,name,code,pay)
        Admin.__init__(self,name,code,experience)

    def display_details(self):
        print(f"Name: {self.name}")
        print(f"Code: {self.code}")
        print(f"Pay: {self.pay}")
        print(f"Experience: {self.experience}")

master = Master("Joshi Smit", 123, 50000, 5)
master.display_details()

