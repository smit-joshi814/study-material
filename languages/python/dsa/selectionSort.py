def selectionSort(arr):
    for i in range(len(arr)-1):
        small=i
        for j in range(i+1,len(arr)):
            # if arr[i] > arr[j]:
            #     arr[i],arr[j]=arr[j],arr[i]
            if arr[small] > arr[j]:
                small=j
        arr[small],arr[i]=arr[i],arr[small]
        print(arr)



list=[20,40,10,50,780,90,100,78,678]
print(list,"\n")
selectionSort(list)