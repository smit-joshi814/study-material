'''
Practical 5
Write a python function to find the factorial of the number
'''

# Function start
def factorial(number):
    if number>1:
        # recursive approach
        return number*factorial(number=number-1)
    else:
        return 1
# function end

number=int(input("Enter Number: "))
print(f"The Factorial of {number} is: {factorial(number=number)}")
