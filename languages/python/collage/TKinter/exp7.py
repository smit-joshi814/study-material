from tkinter import *
root=Tk()
var=StringVar()
label=Label(root,textvariable=var,relief=RAISED)
var.set("Hay ? How are you Doing ?")
label.pack()
root.mainloop()