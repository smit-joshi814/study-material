# Write a Python program to guess a number between 1 to 10. User is prompted
# to enter a guess. If the user guesses wrong then the prompt appears again
# until the guess is correct, on successful guess, user will get a “Correct!!!!"
# message, and the program will exit.

import random
while True:
    number=int(input("Enter Any Random Number: "))
    computer_guss=random.randrange(1,10)
    if number==computer_guss:
        print("Correct!!!!")
        break
    else:
        print("Computer Guss:",computer_guss)