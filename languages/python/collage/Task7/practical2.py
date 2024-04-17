# Employee management System
class Employee():
    def __init__(self,empId,empName,experiance,salary,designation):
        self.empId=empId
        self.empName=empName
        self.experience=experiance
        self.salary=salary
        self.designation=designation
    
    # adds Employee To List
    def addEmployee(self):
        employees.append(self)
        print("Employee Added Successfully")
    
    # removes Employee
    def removeEmployee(self,empId):
        obj=self.search(empId)
        if obj != None:
            employees.remove(obj)
            print("\nEmployee Removed Successfully\n")
        else:
            print("\nInvalid Employee Id ca't Delete Employee\n")

    # Updates Employee
    def updateEmployee(self,empId,newEmpId):
        obj=self.search(empId)
        if obj != None:
            obj.empId=newEmpId
            print("\nEmployee Id Updated Successfully\n")
        else:
            print("\nInvalid Employee Id\n")


    #  Search Employee By empId
    def search(self,empId):
        for i in employees:
            if i.empId==empId:
                return i

    # Disployee Employee Details
    def display(self,employee):
        print()
        print(f"Eployee Id: {employee.empId}")
        print(f"Employee Name: {employee.empName}")
        print(f"Employee Experience: {employee.experience}+ Years")
        print(f"Employee salary: {employee.salary}")
        print(f"Employee Designation: {employee.designation}")
        print()

employees=[]

# To GetEmployeeDetails
def getEmployeeDetails():
    empId=int(input("Enter Employee Id: "))
    empName=input("Enter Employee name: ")
    experience=int(input("Enter Experience in Years: "))
    salary=int(input("Enter Employee Salary: "))
    designation=input("Enter Employee Designation: ")
    return empId,empName,experience,salary,designation


def getEmployeeId(bool=True):
    if bool: return int(input("Enter Employee Id: "))
    else: return int(input("Enter New Id: "))

def main():
    obj=Employee(0,'',0,0,'')
    while True:
        print("\n-----------------------\n1. Enter Employee Details: ")
        print("2. See Available Employees: ")
        print("3. Search Employee by Id: ")
        print("4. Update Employee Id: ")
        print("5. Delete Employee: ")
        print("6. exit\n")
        choice=int(input("Enter choice: "))
        match choice:
            case 1:
                empId,empname,experience,salary,designation=getEmployeeDetails()
                obj=Employee(empId,empname,experience,salary,designation)
                obj.addEmployee()

            case 2:
                for i in employees:
                    obj.display(i)

            case 3:                
                obj.display(obj.search(getEmployeeId()))

            case 4:
                obj.updateEmployee(getEmployeeId(),getEmployeeId(False))

            case 5:
                obj.removeEmployee(getEmployeeId())
            
            case 6:
                break

            case default:
                print("Invalid choice! Try Again")

# Main Calling
main()
