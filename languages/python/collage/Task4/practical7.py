'''
Practical 7
Write a python function to find the sum and average of all the elements in the
list. Return these values and print them outside the function.
'''

def sum_average(numbers):
    sum=0
    for number in numbers:
        sum+=number
    average=sum/len(numbers)
    return sum,average

myList=[100,90,10,56,50,89,67,45,100,780,]
sum,average=sum_average(myList)
print(f"sum is {sum} and average is {average}")