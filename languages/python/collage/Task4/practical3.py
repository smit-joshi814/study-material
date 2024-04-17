'''
Practical 3
Write a menu driven program for creating calculator with arithmetic
operations. Create functions for +,-,* and / and call those functions in switch
case.
'''

# functions start
def sum(num1,num2):
    return num1+num2

def minus(num1,num2):
    return num1-num2

def multiply(num1,num2):
    return num1*num2

def devide(num1,num2):
    return num1/num2
# functions end

num1=int(input("Enter Num 1: "))
num2=int(input("Enter num 2: "))
ans=0
operator=input("Which Operation you want to perform? [+] [-][*][/] : ")

match operator:
    case '+': 
        ans=sum(num1, num2)
    case '-':
        ans=minus(num1, num2) 
    case '*':
        ans=multiply(num1,num2)
    case '/':
        ans=devide(num1, num2)
    case default: print("Invalid choice")

print(f"The Answer is: {ans}")