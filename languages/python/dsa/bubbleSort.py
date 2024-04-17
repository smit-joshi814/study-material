def bubbleSort(arr):
    for i in range(len(arr)-1):
        for j in range(len(arr)-(i+1)):
            if arr[j] > arr[j+1]:
                arr[j],arr[j+1]=arr[j+1],arr[j]
        print(arr)




list=[780,680,100,90,70,50,40,30,20,10]
print(list,"\n")
bubbleSort(list)