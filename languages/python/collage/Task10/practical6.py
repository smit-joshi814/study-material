# Read the student file with data of five students, roll number, name, marks of 5 subjects.
# Display the contents on console and also calculate the percentage.

student_data=open("student_data.txt","r")
for student in student_data:
    studentData=student.split()
    print(f"RollNo: {studentData[0]}\nName: {studentData[1]}")
    sum= float(studentData[2]) + float(studentData[3]) +float(studentData [4]) + float(studentData[5]) +float(studentData[6])
    print(f"Percentage: {sum/5} \n")
    