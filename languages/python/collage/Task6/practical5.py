'''
5. Write a python program to create class student with data name, roll no, sem, marks of 5
subject. Create a method to calculate percentage of the student.
'''

class Student():
    def __init__(self,name,rollNo,sem,marks):
        self.name=name
        self.rollNo=rollNo
        self.sem=sem
        self.marks=marks

    def calculatePercentage(self):
        sum=0
        for i in self.marks:
            sum+=i
        return (sum/500)*100

def main():
    smit=Student(name='Smit Joshi',sem='1',rollNo='18',marks=[80,70,50,90,89])

    print('your percentage is : ',smit.calculatePercentage())

main()