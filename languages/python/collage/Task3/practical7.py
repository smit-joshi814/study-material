# Write a python program to perform following operations on List and display
# the results after each operation:
# (i) Create list with elements 57, 89, 78 and 1.
# (ii) Insert 50 on third position and 25 on first position.
# (iii) Delete second last element of the list.
# (iv) Reverse the list
# (v) Find maximum and minimum of the list
# (vi) Sort the list

# Assuming position=index+1
myList=[57,89,78,1]
print("List: ",myList)
myList.insert(2,50)
print("i.",myList)
myList.insert(0,25)
print("ii.",myList)
myList.pop(-2)
print("iii.",myList)
myList.reverse()
print("iv.",myList)
print("v. Maximum ",max(myList),"Minimum",min(myList))
myList.sort()
print("vi.",myList)
