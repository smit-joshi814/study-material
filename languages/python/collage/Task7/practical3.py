'''
Write a python program to demonstrate the concept of lambda function for finding the
multiple of 7 from the list and adding 10 to all the members of the list.
'''
numbers=[5,2,7, 10,14,67, 21]
# multiples of 7
multiples=list(filter(lambda x:x%7==0,numbers))
print("Multiples Of 7: ",multiples)

numbers=list(map(lambda i:i+10,numbers))
print("Added 10: ",numbers)

