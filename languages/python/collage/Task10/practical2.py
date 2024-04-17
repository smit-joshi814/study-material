# Write a Python code to count the number of words and lines in the input file and display
# the result.

file=open("demo.txt","r")
count=0
lines=0
for line in file:
    tempList=line.split()
    count=count+len(tempList)
    lines=lines+1

print(f"total numbers of words are: {count} and lines are: {lines}")

