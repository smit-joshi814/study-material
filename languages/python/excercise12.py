# Who will pay the bill 
import random

names=input("Enter Names : ").split(",")



print(names[random.randint(0,len(names)-1)],"Will pay the Bill")
