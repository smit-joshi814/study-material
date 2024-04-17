while True:
    num1=int(input("Enter number 1: "))
    num2=int(input("Enter number 2: "))
    choice=input("Enter Choice\n1. +\n2. -\n3. *\n4. /\n")

    try:
        match choice:
            case '+':
                print("The Summation is",num1+num2)
            case '-':
                print("The subatraction is", num1-num2)
            case '*':
                print("The multiplication is",num1*num2)
            case '/':
                print("The division is",num1/num2)
            case default:
                print("Invalid Choice\nExiting program.....")
                break
    except ZeroDivisionError:
        print("Number can't be Devied By Zero")
        break