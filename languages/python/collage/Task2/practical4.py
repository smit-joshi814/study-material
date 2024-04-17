#  Write a python program to take two numbers from user and apply inbuilt
# function to find absolute of no, ceil of number , floor, max, min, power, sqrt,
# round off the two numbers.

import math
num1=int(input("Enter Number 1 "))
num2=int(input("Enter Number 2 "))

# Applying functions
print(f"Absolute of {num1}/{num2}:",abs(num1/num2))
print(f"Ceil of : {num1}/{num2}:",math.ceil(num1/num2))
print(f"floor of : {num1}/{num2}:",math.floor(num1/num2))
print(f"Max between : {num1} and {num2}:",max(num1,num2))
print(f"Min between : {num1} and {num2}:",min(num1,num2))
print(f"power of : {num1} is {pow(num1,2)} and {num2} is {pow(num2,2)}")
print(f"sqrt of: {num1} is {math.sqrt(num1)} and {num2} is {math.sqrt(num2)}")
print(f"Round off Of {num1}/{num2} is {round(num1/num2,2)}")
