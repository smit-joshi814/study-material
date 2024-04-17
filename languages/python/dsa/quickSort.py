
def partition(arr,lb,ub):
    pivot=arr[lb]
    start=lb
    end=ub
    flag=False
    while not flag:

        while start<=end and arr[start] <= pivot:
            start+=1
        while start<=end and arr[end] > pivot:
            end-=1
        
        if start > end:
            flag=True
        else:
            arr[start],arr[end]=arr[end],arr[start]

    arr[lb],arr[end]=arr[end],arr[lb]
    print(arr)
    return end

def quickSort(arr,lb,ub):
    if lb < ub:
        mid=partition(arr,lb,ub)
        # print(mid)
        quickSort(arr,lb,mid-1)
        quickSort(arr,mid+1,ub)


list=[780,680,100,90,70,50,40,30,20,10]
print(list,"\n")
quickSort(list,0,len(list)-1)