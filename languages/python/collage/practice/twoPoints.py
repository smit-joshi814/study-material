# 2. write a program to take 2 points from the user and find the distance between them,


def findDistance(x1,y1,x2,y2):
    x3=pow(x2-x1,2)
    y3=pow(y2-y1,2)
    return x3,y3

x1=int(input("Enter x1 "))
y1=int(input("Enter y1 "))
x2=int(input("Enter x2 "))
y2=int(input("Enter y2 "))

x3,y3=findDistance(x1,y1,x2,y2)
print(f"Distance is: ({x3},{y3})")
