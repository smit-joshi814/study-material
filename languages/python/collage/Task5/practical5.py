'''
Write a python program to demonstrate the concept of default arguments. Take the
employee data from user: name, department and basic_salary. Write a function to to
calculate total salary of the employee where total salary is sum of basic salary, DA and
HRA. DA is 10% of basic salary and HRA is 15% of basic salary. If basic salary is missing,
take default argument of basic salary as Rs. 9000
'''

def cacTotalSalary(employeeName,department,basic=9000):
	da=basic*0.10
	hra=basic*0.15
	totalSalary=basic+da+hra
	print(f"Name: {name} \nDepartment: {department}\n Total Salary: {totalSalary}")

name=input("Enter Name ")
department=input("Enter Department ")
basic=int(input("Enter Basic "))

cacTotalSalary(name,department,basic)
print()
name=input("Enter Name ")
department=input("Enter Department ")
cacTotalSalary(name,department)