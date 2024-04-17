# Write a python program to display the following pattern
# *
# * *
# * * *
# * * * *
# * * * * *

n=int(input("Enter Number: "))
for i in range(1,n+1):
	for j in range(i):
		print("*",end="")
	print()
