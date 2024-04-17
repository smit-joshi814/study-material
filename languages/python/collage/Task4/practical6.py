'''
Practical 6
Write a python function to find the GCD of two numbers.
'''

def findGCD(num1,num2):
    i=1
    gcd=0
    while i<=num1 and i<=num2:
        if num1%i==0 and num2%i==0:
            gcd=i
        i+=1
    return gcd

num1=int(input("Enter Number 1: "))
num2=int(input("Enter number 2: "))

print(f"The Greatest comman Deviser of {num1} and {num2} is : {findGCD(num1=num1,num2=num2)}")