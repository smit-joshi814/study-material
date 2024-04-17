# Write a Python program to count the number of even and odd numbers from a
# series 1 to N.(N will be entered by user).

N=int(input("Enter N Limit "))
odd=0
even=0
for i in range(1,N+1):
    if i%2==0:
      even+=1
    else:
      odd+=1

print(f"Odd Count:{odd}")
print(f"Even Count {even}")
