def print_pattern(limit):
    # Pattern 1
    for i in range(limit):
        if i % 2 == 0 :
            for j in range(limit):
                if j % 2 == 0:
                    print("1",end=" ")
                else:
                    print("0",end=" ")
            print()
        else:
            for j in range(limit):
                if j % 2 == 0:
                    print("0",end=" ")
                else:
                    print("1",end=" ")
            print()

    print()
    print()
    # pattern 2
    for i in range(limit+1):
        for j in range(1,i+1):
            print("*",end=" ")
        print()
    for i in range(limit,1,-1):
        for j in range(1,i):
            print("*",end=" ")
        print()

    # pattern_3
    counter=0
    for i in range(limit+1):
        for j in range(1,i+1):
            counter+=1
            print(counter,end=" ")
        print()
print_pattern(int(input("Enter Limit")))