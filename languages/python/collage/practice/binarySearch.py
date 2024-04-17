def binarySearch(arr,start,end,Element):
    mid=(start+end)//2
    for i in range(len(arr)):
        if start<end:
            mid=(start+end)//2
            if arr[mid]==Element:
                return mid
            elif arr[mid] < Element:
                start=mid+1
            elif arr[mid] > Element:
                end=mid-1
        else:
            return 0
    
arr=[10,50,60,100,120,140,150,180]
print(binarySearch(arr,0,len(arr),120))
  