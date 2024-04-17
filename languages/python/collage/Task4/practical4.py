'''
Write a function to print following patterns:
 (i)    1 0 1 0 1
        0 1 0 1 0
        1 0 1 0 1
        0 1 0 1 0
        1 0 1 0 1

 (ii)   1
        2 3
        4 5 6
        7 8 9 10

 (iii)  *
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        * 
'''


def printPattern_1(limit): 
    for i in range (1, limit+1):
        if i%2==0:
            for j in range(1, limit+1):
                if j%2==0:
                    print("1 ", end="")
                else:
                    print("0 ",end="")
        else: 
            for j in range(1, limit+1):
                if j%2!=0:
                    print("1 ", end="")
                else:
                    print("0 ", end="")
        print()

def printPattern_2(limit):
    counter=0
    for i in range(1,limit):
        for j in range(i):
            counter+=1
            print(counter,end=" ")
        print()


def printPattern_3(limit):
    for i in range(limit):
        for j in range(i):
            print("*",end=" ")
        print()
    for i in range(limit,0,-1):
        for j in range(i):
            print("*",end=" ")
        print()

limit=int(input("Enter Limit: "))
print("<------Patteren i ------>")
printPattern_1(limit=limit)
print()
print("<------Patteren ii ------>")
printPattern_2(limit=limit)
print()
print("<------Patteren iii ------>")
printPattern_3(limit=limit)