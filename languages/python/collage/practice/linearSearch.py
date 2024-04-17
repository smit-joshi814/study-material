# 4. write a program to implement linear and binary search

def linearSearch(arr,elementToFind):
    for i in range(len(arr)):
        if arr[i]==elementToFind:
            print("Element Found at",i)
            break
    else:
        print("Element Not Found")


arr=[10,30,20,78,56,34]
linearSearch(arr,200)