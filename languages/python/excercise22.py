def isPrime(number):
    import math
    prime=True
    if number==1:
        prime=False
    for i in range(2,math.ceil(number/2)+1):
        if number%i==0:
            prime=False
    
    if prime:
        print(number,"is prime number")
    else:
        print(number,"is not prime number")

isPrime(int(input("Enter Number ")))
