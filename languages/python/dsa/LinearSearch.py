def linearSearch(myArr,search):
    for i in range(len(myArr)):
        if myArr[i] == search:
            return i
    else:
        print("No Element Found")

myArr=[10,50,67,90,100]
print(myArr)
search=int(input("Search? "))

print(linearSearch(myArr,search))