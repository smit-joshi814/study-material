import random
user_choice=int(input("Enter your choice "))
if user_choice>=3:
    print("Incorrect choice ,You Loose")
else:
    computer_choice=random.randint(0,2)
    print("computer's Choice",computer_choice)
    if computer_choice==user_choice:
        print("It's a Draw")
    elif user_choice==0 and computer_choice==2:
        print("You Loose")
    elif computer_choice==0 and user_choice==0:
        print("You Win")
    elif computer_choice>user_choice:
        print("You Loose")
    elif user_choice>computer_choice:
        print("You Win")