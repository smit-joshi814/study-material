from tkinter import *
from tkinter import IntVar
def sel():
    selection="You Selected the option "+str(var.get())
    lbl.config(text=selection)
root=Tk()
var=IntVar()
r1=Radiobutton(root,text="Option 1",variable=var,value=1,command=sel)
r1.pack(anchor=W)
r2=Radiobutton(root,text="Option 2",variable=var,value=2,command=sel)
r2.pack(anchor=W)
r3=Radiobutton(root,text="Option 3",variable=var,value=3,command=sel)
r3.pack(anchor=W)
lbl=Label(root)
lbl.pack()
root.mainloop()