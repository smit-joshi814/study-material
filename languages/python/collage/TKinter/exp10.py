from tkinter import *
from tkinter import StringVar
root=Tk()
var=StringVar()
lbl=Message(root,textvariable=var,relief=RAISED)
var.set("Hey!? How are you doing?")
lbl.pack()
root.mainloop()