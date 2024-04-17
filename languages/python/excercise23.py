student_data={
    "smit":85,
    "vijay":80,
    "switi":96,
    "tabbssum":65,
    "nisha":39,
    "tanish":70,
    "vanish":60,
    "umang":50
}

student_grades={}
for student in student_data:
    marks=student_data[student]
    if marks>90:
        student_grades[student]="A+"
    elif marks>80:
        student_grades[student]="A"
    elif marks>70:
        student_grades[student]="B+"
    elif marks>60:
        student_grades[student]="B"
    elif marks>50:
        student_grades[student]="C"
    elif marks>40:
        student_grades[student]="D"
    else:
        student_grades[student]="F"

print(student_grades)
