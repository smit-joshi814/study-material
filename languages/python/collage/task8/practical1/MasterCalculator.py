from calculator import SimpleCalculator as cal,ScientificCalculator as sci

def getNum():
    return int(input("Enter Number "))

while True:
    print("1.Add\n2.substract\n3.multiply\n4.divide\n5.sin\n6.cos\n7.tan\n8.power\n9.exit")
    choice=int(input("Enter Choice "))
    print()
    match choice:
        case 1:
            print("sum is",cal.add(getNum(),getNum()))
        case 2:
            print("substraction is",cal.sub(getNum(),getNum()))
        case 3:
            print("multiplication is",cal.mul(getNum(),getNum()))
        case 4:
            print("division is",cal.div(getNum(),getNum()))
        case 5:
            print("sin is",sci.sin1(getNum()))
        case 6:
            print("cos is",sci.cos1(getNum()))
        case 7:
            print("tan is",sci.tan1(getNum()))
        case 8:
            print("power is",sci.power1(getNum(),getNum()))
        case default:
            print("Exiting...")
            break
    print()


