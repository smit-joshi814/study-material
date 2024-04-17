import distance as d


feet1=int(input("Enter value of Feet 1: "))
feet2=int(input("Enter value of Feet 2: "))
inch1=int(input("Enter value of Inch 1: "))
inch2=int(input("Enter value of Inch 2: "))

objdis1=d.Distance(feet1,inch1)
objdis2=d.Distance(feet2,inch2)

if inch1>11 or inch2 >11:
    print("Inch should not be more than 11")
else:
    totalFeets,totalInchs=objdis1.sumFitInch(objdis2)
    print(f"Feets: {totalFeets} \nInchs: {totalInchs}")