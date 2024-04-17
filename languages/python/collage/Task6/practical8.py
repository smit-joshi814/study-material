'''
8. Write a python program for creating class Height with members feet and inch. Create a
constructor to initialize the objects and write the method for addition of two Height
objects , validate and display the result. (For validation: Inch<12)
'''

class Height():
    def __init__(self,feet1,feet2,inch1,inch2):
        self.feet1=feet1
        self.feet2=feet2
        self.inch1=inch1
        self.inch2=inch2

    def sumFitInch(self):
        Sumfeet=self.feet1+self.feet2
        SumInchs=self.inch1+self.inch2
        if SumInchs>12:
            Sumfeet+=SumInchs//12
            SumInchs=SumInchs%12
        return Sumfeet,SumInchs
    
def main():
        
    feet1=int(input("Enter value of Feet 1: "))
    feet2=int(input("Enter value of Feet 2: "))
    inch1=int(input("Enter value of Inch 1: "))
    inch2=int(input("Enter value of Inch 2: "))

    if inch1>11 or inch2 >11:
        print("Inch should not be more than 11")
    else:
        obj=Height(feet1=feet1,feet2=feet2,inch1=inch1,inch2=inch2)
        totalFeets,totalInchs=obj.sumFitInch()
        print(f"Feets: {totalFeets} \nInchs: {totalInchs}")

main()