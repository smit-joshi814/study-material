'''
Write a menu driven program to implement the queue with operations insertion , deletion
and display.
'''

queue=[]
LIMIT=10
FIRST=-1
LAST=-1

def insert(value):
	global LIMIT,FIRST,LAST
	if FIRST < LIMIT:
		if FIRST==-1 and LAST==-1: 
			FIRST=0
			LAST=0
		else: 
			LAST+=1
		queue.append(value)
	else:
		print("Queue is Full")

def deletion():
	global FIRST,LAST
	if FIRST==-1:
		print("Queue is Empty")
		return
	else:
		val=queue[FIRST]
		if FIRST==LAST:
			FIRST=-1
			LAST=-1
		else:
			FIRST+=1
		return val

def display():
	global FIRST,LAST
	if FIRST!=-1:		
		for i in range(FIRST,LAST+1):
			print(queue[i],end=" ")
	else:
		print("Quue is Empty")


while True:
	print()
	print("Enter 1 to Insert()",end="\t")
	print("Enter 2 to Delete()",end="\t")
	print("Enter 3 to Display()",end="\t")
	print("Enter 4 to Exit()")
	choice=input("Enter choice: ")
	if choice=="1":
		val=input("Enter Value: ")
		insert(val)
	elif choice=="2":
		print(deletion(),"Deleted")
	elif choice=="3":
		display()
	elif choice=="4":
		break
	else:
		print("invalid choice")