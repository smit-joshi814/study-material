from tkinter import *
root = Tk()

# Created Label
myLabel1 = Label(root,text="Hello World")
myLabel2 = Label(root,text="My name Is Smit Joshi")


#  putting On Screen
myLabel1.grid(row=0,column=0)
myLabel2.grid(row=1,column=5)

root.mainloop()