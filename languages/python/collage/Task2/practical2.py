# Write a python program to find the given number is palindrome or not .

number=int(input("Enter The number "))
num2=number
reverse=""
while num2 > 0:
	digit=str(int(num2%10))
	reverse+=digit
	num2//=10
if reverse==str(number):
	print(f"{number} is Pellindrom number")
else:
	print(f"{reverse} is not a Pellindrom number")
