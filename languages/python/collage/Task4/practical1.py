'''
Practical 1 
Write a python function for calculating cube of the number.
Define a second function called by_three that takes an argument called
number. if that number is divisible by 3, by_three should call cube(number)
and return its result. Otherwise, by_three should return False.
'''

# functions start
def cube(number): 
    return number*number*number

def by_three (number): 
    if number%3==0: 
        return cube (number) 
    else:
        return False
# functions end

number=int(input("Enter Number: ")) 
result=by_three (number)
print (f"The result is {result}")