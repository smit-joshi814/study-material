'''
9. Write a recursive function taking one integer argument, if argument is zero return zero else
return sum of all the predecessor of that argument
'''

def sumOfPredecesor(number):
    if number == 0:
        return 0
    else:
        return number+ sumOfPredecesor(number-1)
    
number=int(input("Enter number: "))
print(f"Sum Of predecessor of {number} is {sumOfPredecesor(number)}")