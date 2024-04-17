#Write a program to take 7 numbers from user and 
# calculate the sum of those 7 numbers & display results

sum=0
for i in range(1,8):
    sum+=int(input(f"Enter Number {i} "))
print(f"the summation is {sum}")