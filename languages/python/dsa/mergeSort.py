def marge(arr,start,mid,end):
    print("Merging:",arr[start:end+1])
    p=start
    q=mid+1
    temp=[]

    for i in range(start,end+1):
        if p > mid:
            temp.append(arr[q])
            q+=1
        elif q > end:
            temp.append(arr[p])
            p+=1
        elif arr[p] < arr[q]:
            temp.append(arr[p])
            p+=1
        else:
            temp.append(arr[q])
            q+=1
    for i in range(len(temp)):
        arr[start]=temp[i]
        start+=1
    print("Sorted: ",temp,"\n")

def margeSort(arr,start,end):
    if start < end:
        mid=(start+end)//2
        margeSort(arr,start,mid)
        print("\nArray 1:",arr[start:mid+1])
        margeSort(arr,mid+1,end)
        print("Array 2:",arr[mid+1:end+1])
        marge(arr,start,mid,end)


list=[780,680,100,90,70,50,40]
print(list,"\n")
margeSort(list,0,len(list)-1)
