height_str=input("Enter Heights ").split(",")

count=0
for i in height_str:
    count+=1

heights=[]
for height in range(count):
    heights.append(int(height_str[height]))

sum=0
for i in heights:
    sum+=i

avg=round(sum/count)
print("Average HEights is",avg)