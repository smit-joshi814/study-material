# Write a python program to display the length of longest line in the text file and also
# display the content of that line.



def getLongestFileInfo(filename):
    demo=open(filename,"r")
    longest=0
    content=""
    for line in demo:
        if len(line) > longest:
            longest=len(line)
            content=line
        
    print(f"Length of longest line is: {longest}")
    print(f"content of longest line is: {content}")


getLongestFileInfo("demo.txt")
