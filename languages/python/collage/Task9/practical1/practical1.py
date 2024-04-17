file1=input("Enter File 1 name: ")
content=input("Enter File Content: ")
file2=input("Enter File 2 Name: ")

try:
    f1=open(file1,"w")
    f1.write(content)

    f2=open(file2,"w")
    
    
    f1=open(file1,"r")
    f2.write(f1.read())
        # print(line)
except:
    print("Error: can't find file or read data")
finally:
    print("Operation Completed")
