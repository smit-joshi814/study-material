from tkinter import *
root = Tk()

e = Entry(root,width=40,bg="blue",fg="#ffffff",border=2)
e.pack()
e.insert(0,"Enter Your StackBook")

def myClick():
    hello= e.get()
    myLable= Label(root,text=hello)
    myLable.pack()

myButton = Button(root,text="Enter Your Name",command=myClick,fg="blue",bg="#ffffff")
myButton.pack()
root.mainloop()