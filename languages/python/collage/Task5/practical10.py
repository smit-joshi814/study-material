'''
Write a recursive function for printing the fibonacci series. The argument n will be passed
to the function, where n is number of terms in the series
'''

def fibonacci(n):
  if n <= 1:
    return n
  else:
    return (fibonacci(n - 1)+fibonacci(n-2))

n = int(input("Enter N: "))
for i in range(n+1):
    print(fibonacci(i))

