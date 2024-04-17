import random

print("Welcome To the password Generator!")
latters=int(input("Hpw many Latters would you like in your password ?"))
symbols=int(input("how many symbols would you like ?"))
numbers=int(input("How many numbers would you like ?"))

randomLatters=[]

randomLatters=random.sample("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijakmnopqrstuvwxyz",latters)
randomSymbols=random.sample("<,>.?/':;{[]}=+-_)(~`@#%^&*",numbers)
randomNumbers=random.sample("1234567890",numbers)

password=[]
for i in randomLatters:
    password.append(i)

for i in randomSymbols:
    password.append(i)

for i in randomNumbers:
    password.append(i)

random.shuffle(password)

print("Your Password is: ",end="")
for i in password:
    print(i,end="")