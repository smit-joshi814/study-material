#Write a program to find the given number is prime or not
number=int(input("Enter Number : "))

flag=False
for i in range(2,number):
    if number%i==0:
        flag=True
        break

if not(flag): print(f"{number} is Prime Number")
else: print(f"{number} is not a Prime Number")