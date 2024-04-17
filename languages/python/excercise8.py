year=int(input("Enter year "))
if(year%4==0):
    if(year%100==0):
        if(year%400==0):
            print("It is leap year")
        else:
            print("It is Not Leap Year")
    else:
        print("It is leap year")
else:
    print("It is not Learp Year")