'''
Write a function to add the values of two list and store that in third list and display the result.
'''
def listOperation(list1,list2):
    if len(list1)!=len(list2):
        print("List Should be of the same size ")
        return 
    else:
        list3=[]
        for i in range(len(list1)):
            list3.append(list1[i]+list2[i])
        return list3

list1=[10,20,30,40,50]
list2=[10,20,30,40,50]

list3=listOperation(list1,list2)
print(list3)