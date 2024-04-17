# 3. write the program to sort the array using bubble sort

def bubbleSort(arr):
    for i in range(len(arr)):
        for j in range(len(arr)-1):
            if arr[j] > arr[j+1]:
                temp=arr[j]
                arr[j]=arr[j+1]
                arr[j+1]=temp
    return arr


arr=[10,40,90,5,20,60,76]
print(bubbleSort(arr))
