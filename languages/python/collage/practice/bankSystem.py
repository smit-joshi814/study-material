# 1. write a program to create banking system with functions, for depositing amount, widrawing the amount, and balance inquiry,

amount=0
def depositAmount(value):
    global amount
    amount+=value
    print("Amount Deposited")

def widrawAmount(value):
    global amount
    if (value<amount):
        amount-=value
        print("Widrawn successfully")
    else:
        print("Insufficient balance")

def balanceInquiry():
    global amount
    print("your current balance is",amount)

while True:
    print("1. Deposit\n2.Widraw\n3.Balance Inquiry")
    choice=int(input("Enter Choice"))
    match choice:
        case 1:
            value=int(input("Enter Amount: "))
            depositAmount(value)
        case 2:
            value=int(input("Enter Amount: "))
            widrawAmount(value)
        case 3:
            balanceInquiry()
        case 4:
            break


            