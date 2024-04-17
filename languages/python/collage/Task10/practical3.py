# Write a Python program that encrypts the contents of a text file using a simple encryption
# algorithm. Decrypt the file and display on console



def encryptFile(inputFile,outputFile):
    file=open(inputFile,"r")
    temp=open(outputFile,"w")
    for line in file:
        for char in line:
            temp.write(chr(ord(char)+2))


encryptFile("demo.txt","encryptedDemo.txt")

file=open("encryptedDemo.txt","r")
for line in file:
    for char in line:
        print(chr(ord(char)-2),end="")