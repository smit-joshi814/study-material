from tkinter import *
def sel():
    selection = "You selected the option " + str(var.get())
    lbl.config(text = selection)

root= Tk()
var = DoubleVar()
scale=Scale(root,variable=var)
scale.pack(anchor=CENTER)
button=Button(root,text="Get Scale Value",command=sel)
button.pack(anchor=CENTER)
lbl=Label(root)
lbl.pack()
root.mainloop()