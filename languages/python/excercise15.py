numbers=input("Enter Some Numbers ").split(",")
count=0

for i in numbers:
    count+=1

num_list=[]
for number in range(count):
    num_list.append(int(numbers[number]))

max_num=num_list[0]

for num in num_list:
    if num > max_num:
        max_num=num

print("Maximum number is:",max_num)