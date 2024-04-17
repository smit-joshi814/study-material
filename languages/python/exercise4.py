# calculate BMI
weight=int(input("Enter your Weight in kgs: "))
height=float(input("Enter your height in meters: "))
bmi=weight/(height**2)
print("Your BMI is:",round(bmi,2))