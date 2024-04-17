# Write a Python code, for copying the content of one file to another file.
demo=open("demo.txt","r")
writer=open("write.txt","w")
for line in demo:
    writer.write(line)

