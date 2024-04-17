# Student Management System

class Student():
    def __init__(self,rollNo,name,marks1,marks2):
        self.rollNo=rollNo
        self.name=name
        self.marks1=marks1
        self.marks2=marks2

    def accept(self):
        # Will Add the current Student to list
        ls.append(self)
        print("\n! Student Details Added SuccessFully !\n")
    
    # display the given Student details
    def display(self,obj):
        print()
        print(f"rollNo : {obj.rollNo}")
        print(f"Name : {obj.name}")
        print(f"Marks 1 : {obj.marks1}")
        print(f"Marks 2: {obj.marks2}")
        print()

    # searches for Student by rollNo
    def search(self,rollNo):
        for i in ls:
            if i.rollNo==rollNo:
                return i
            
    # Deletes the Student by rollNo
    def delete(self,rollNo):
        obj=self.search(rollNo)
        if obj != None:
            ls.remove(obj)
            print("\nStudent removed Successfully\n")
        else:
            print(f"\nInvalid oldRollNo no Student Found With {rollNo}\n")

    # Updates the Student rollNo with newRollNo
    def update(self,oldNo,newRollNo):
        obj=self.search(oldNo)
        if obj != None:
            obj.rollNo=newRollNo
            print("\nStudent Updated Successfully\n")
        else:
            print(f"\nInvalid oldRollNo no Student Found With {oldNo}\n")


# Global list 
ls=[]

# To get the Student Details From User
def getStudentDetails():
    rollNo=int(input("Enter Roll No: "))
    name=input("Enter name: ")
    marks1=int(input("Enter Marks 1: "))
    marks2=int(input("Enter Marks 2: "))
    return rollNo,name,marks1,marks2

# Get Student RollNo
def getRollNo(bool=True):
    if bool:  return int(input("Enter rollNo: "))
    else: return int(input("Enter new rollNo: "))

# Main method
def main():
    obj=Student(0,'',0,0)
    while True:
        print("\n-----------------------\n1. Enter Student Details: ")
        print("2. See Available Students: ")
        print("3. Search Student by rollNo: ")
        print("4. Update Student rollno: ")
        print("5. Delete Student: ")
        print("6. exit\n")
        choice=int(input("Enter choice: "))
        match choice:
            case 1:
                rollNo,name,marks1,marks2=getStudentDetails()
                obj=Student(rollNo,name,marks1,marks2)
                obj.accept()
            
            case 2:
                for i in ls:
                    obj.display(i)

            case 3:                
                obj.display(obj.search(getRollNo()))

            case 4:
                obj.update(getRollNo(),getRollNo(False))

            case 5:
                obj.delete(getRollNo())
            
            case 6:
                break

            case default:
                print("Invalid choice! Try Again")

# Main Calling
main()
