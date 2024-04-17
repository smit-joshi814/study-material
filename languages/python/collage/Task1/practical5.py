# Write a program to take percentage of student as an input 
# and display the grade of student
# if per >=85 Grade A
# per >=75 and <85 Grade B
# per >=65 and <75 Grade C
# per >=55 and <65 Grade D
# per >=40 and <55 grade E
# per <40 Grade F

percentage=int(input("Enter Percentage: "))
grade=''
if percentage >=85: grade='A'
elif percentage >=75 and percentage<85:grade='B'
elif percentage>=65 and percentage <75:grade='C'
elif percentage>=55 and percentage<65:grade='D'
elif percentage>=40 and percentage<55:grade='E'
elif percentage<40:grade='F'

print(f"Your Grade is {grade}")

    