'''
4. Write a python program to demonstrate the concept of default arguments. Create the
employee class: name, department and basic_salary. Write a function to to calculate total
salary of the employee where total salary is sum of basic salary, DA and HRA. DA is 10%
of basic salary and HRA is 15% of basic salary. If basic salary is missing, take default
argument of basic salary as Rs. 9000
'''

class Employee():
    def __init__(self,name,department,basic_salary=9000):
        self.name=name
        self.department=department
        self.basic_salary=basic_salary

    def getTotalSalary(self):
        da=self.basic_salary*0.10
        hra=self.basic_salary*0.15
        total_salary=da+hra+self.basic_salary
        return total_salary
    

def main():
    emp1=Employee(name='Smit Joshi',department='MSCIT',basic_salary=10000)
    print('total salary is: ',emp1.getTotalSalary())

main()
