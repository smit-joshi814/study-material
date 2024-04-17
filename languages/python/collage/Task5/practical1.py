'''
1. Write a python program for performing following operations and display results after each
operation:
(i) Create dictionary with details of 5 students : Rollno, name, semester, course, percentage.
(ii) Update semester of student3 to 2.
(iii) Delete the data of 4th student.
(iv) Copy this dictionary to dict2
(v) Display the length of both the dictionaries
'''

dictionary={
	"student1":{
		"RollNo":1,
		"name":"smit",
		"semester":7,
		"course":"mscit",
		"percentage":90
	},
	"student2":{
		"RollNo":2,
		"name":"tejasv",
		"semester":6,
		"course":"bscit",
		"percentage":80
	},
	"student3":{
		"RollNo":3,
		"name":"switi",
		"semester":8,
		"course":"mscit",
		"percentage":89
	},
	"student4":{
		"RollNo":4,
		"name":"tabbssum",
		"semester":5,
		"course":"bscit",
		"percentage":50
	},
	"student5":{
		"RollNo":5,
		"name":"nisha",
		"semester":7,
		"course":"mscit",
		"percentage":40
	},
}

# print(dictionary)

dictionary["student3"]["semester"]=2
print()
print(dictionary["student3"])
print()
del dictionary["student4"]
dict2=dictionary.copy()
print(dict2)

print("Length of Dictionary",len(dictionary))
print("Length of dict2",len(dict2))