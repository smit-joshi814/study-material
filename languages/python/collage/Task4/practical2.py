'''
Practical 2
Write a python function to print all the prime numbers between the specific
range given bt user.
'''

# get Primes Start
def getPrimes (start, end): 
    for number in range (start, end+1): 
        isPrime=True 
        for i in range (2, number): 
            if number %i==0: 
                isPrime=False
        if isPrime:
            print(number, end=" ")
# get Primes End


print("Enter range To get Prime Numbers! ")
start=int(input("start: ")) 
end=int(input("end: "))
getPrimes (start=start, end=end)