def binarySearch(arr,search):
    l=0
    r=len(arr)
    # mid=l+r//2
    while l<=r:
        mid=l+(r-1)//2
        if arr[mid]==search:
            return mid
        elif arr[mid] < search:
            l=mid+1
        elif arr[mid] > search:
            r=mid-1
    else:
        return -1

arr=[10,30,50,60,70,80,90,100]
print(arr)
search=int(input("Search? "))
print(binarySearch(arr,search))