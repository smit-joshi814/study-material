# calculates the sum of the squares of odd natural numbers up to a user-defined value N

N=int(input("Enter N: "))

try:
    if N <= 0:
        raise Exception("N can't be Negative or Zero")
    else:
        number=1
        sum=0
        while N>0:
            sum=sum+(number*number)
            number=number+2
            N=N-1
        print("The Solution is",sum)
finally:
    print("Execution Completed")