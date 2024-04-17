# WRITE A PYTHON PROGRAM TO FIND WHETHER THE GIVEN NUMBER IS PERFECT OR NOT .
number=int(input("Enter Number "))

sum=0
for i in range(1,number):
	if number%i==0:
		sum+=i

if sum==number:
	print(f"{number} is perfact number")
else:
	print(f"{number} is not perfact number")