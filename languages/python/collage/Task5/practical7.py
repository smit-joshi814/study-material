'''
Write a function to find whether the number is armstrong number or not
'''

def isArmstrong(number):
    sum=0
    temp=number
    while temp>0:
        digit=temp%10
        sum+=digit**3
        temp//=10
    if sum==number:
        return True
    if temp == 0:
        print(sum)
        return False
    
number=int(input("Enter number: "))
if isArmstrong(number=number):
    print(f"{number} is Armstrong Number")
else:
    print("Number is Not Armstrong")