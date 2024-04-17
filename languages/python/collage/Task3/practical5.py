# Write a Python program to Print those numbers which are divisible by 7 and
# multiple of 5, between 1500 and 2700 (both included), also print total of such
# numbers.
sum=0
for i in range(1500,2700+1):
    if i%7==0 and i%5==0:
        print(i,end=" ")
        sum+=i
print()
print("total of numbers: ",sum)