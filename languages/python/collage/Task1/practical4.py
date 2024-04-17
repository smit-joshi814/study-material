# Write a program to get 3 numbers from user 
# and find the largest number from it and print the result

num1=int(input("Enter number 1 "))
num2=int(input("Enter number 2 "))
num3=int(input("Enter number 3 "))

if num1>num2 and num1>num3:
    print(f"{num1} is largest")
elif num2>num3:
    print(f"{num2} is largest")
else:
    print(f"{num3} is largest")