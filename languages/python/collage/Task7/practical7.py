'''
Write a Python program to filter a list of integers using Lambda into positive, negative and
zero numbers. (Create three different lists and display)
'''

numbers=[10,0,20,-47,-134]
print("Original: ",numbers)

positive=list(filter(lambda x: x > 0, numbers))
negative=list(filter(lambda x: x < 0, numbers))
zero=list(filter(lambda x: x==0 , numbers))

print("Poritive:",positive,"\nNegative:",negative,"\nZero:",zero)


