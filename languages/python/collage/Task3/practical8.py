# Write a Python program to to perform following operations on Tuple and
# display the results after each operation: 
# (i) Create tuple with elements 65,12, 78 ,12, 23 and 7
# (ii) Display 4th element from starting and 2nd element from last.
# (iii) Count the occurence of 12 in the tuple
# (iii) Create tuple containing all your subjects
# (iv) Find minimum and maximum from both the tuple

myTuple=(65,12,78,12,23,7)
print("i.",myTuple)
print("ii. from startring:",myTuple[3],"from last:",myTuple[-2])
print("iii. occurence:",myTuple.count(12))

subjects=("DAA","NoSQL","Python","OOAD","CCV")
print("iv. Minimum:",min(myTuple),"Maximum:",max(myTuple))
print("iv. Minimum:",min(subjects),"Maximum:",max(subjects))
