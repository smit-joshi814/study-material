# calculate BMI advance version
weight=float(input("Enter your Weight in kgs: "))
height=float(input("Enter your height in meters: "))
bmi=round(weight/(height**2))


if bmi < 18.5:
    print(f"yor bmi is {bmi} and you are under weight")
elif bmi <25 :
    print(f"your bmi is {bmi} and you are normal")
elif bmi < 30 :
    print(f"your bmi is {bmi} and you are over weight")
elif bmi < 35:
    print(f"your bmi is {bmi} and you are Obese")
else:
    print(f"your bmi is {bmi} and you are clinically obese")


