def insertionSort(arr):
    for i in range(1,len(arr)):
        key=arr[i]
        j=i-1
        while j>=0 and key < arr[j]:
            arr[j+1]=arr[j]
            j-=1
            print(arr)
        arr[j+1]=key
        print()
    print(arr)

list=[780,680,100,90,70,50,40,30,20,10]
print(list,"\n")
insertionSort(list)