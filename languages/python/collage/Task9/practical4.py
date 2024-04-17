name=input("Enter Name: ")
age=int(input("Enter Age: "))
gender=input("Enter Gender: ")

class CustomException(RuntimeError):
    def __init__(self,error):
        self.error=error

try:
    if age < 18:
        raise CustomException("Sorry, You're Not Eligible for voting")
    else:
        print("Name: ",name)
        print("Age: ",age)
        print("Gender: ",gender)
except CustomException as e:
    print(e.args)
finally:
    print("Execution Completed...")
