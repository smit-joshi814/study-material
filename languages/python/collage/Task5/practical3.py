'''
Write a menu driven program to implement the stack with operations push,pop and display.
'''
LIMIT=50
stack=[]
top=-1
def push(value):
	global top
	global LIMIT
	if top < LIMIT:
		top+=1
		stack.append(value)
	else:
		print("stack is full")

def pop():
	global top
	if top!=-1:
		val=stack[top]
		top-=1
		return val
	else:
		return None
		

def display():
	global top
	if top!=-1:
		for i in range(top+1):
			print(stack[i],end=" ")
	else:
		print("Stack is Empty")

while True:
	print()
	print("Enter 1 For push()",end="\t")
	print("Enter 2 For pop()",end="\t")
	print("Enter 3 To Display()",end="\t")
	print("Enter 4 To Exit()")
	choice=input("Enter Choice: ")
	if choice=="1":
		val=input("Enter value: ")
		push(val)
	elif choice=="2":
		print(f"{pop()} deleted")
	elif choice=="3":
		display()
	elif choice=="4":
		break
	else:
		print("invalid choice")