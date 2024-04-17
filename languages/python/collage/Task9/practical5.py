size=int(input("Size of array: "))

arr=[]
try:
    if size <= 0:
        raise Exception("Size can't be Zero or Negative")
    elif size> 10:
        raise Exception("Size can't be greater than 10")
    else:
        for i in range(size):
            arr.append(int(input(f"Enter {i+1} number ")))

        print("Maximum Element in Array is: ",max(arr))
        print("Minimum Element in Array is: ",min(arr))
finally:
    print("Execution Completed...")
