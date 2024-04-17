# Write a Python program that concatenates the contents of two text files into a single
# output file

demo=open("demo.txt","r")
write=open("write.txt","r")

temp=open("temp.txt","w")
for line in demo:
    temp.write(line)

for line in write:
    temp.write(line)