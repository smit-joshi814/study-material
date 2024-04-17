from tkinter import *
import tkinter.messagebox as tkMessageBox
top=Tk()
top.geometry("200x200")

def data(event):
    tkMessageBox.showinfo("Data",ent.get())
    print(ent.get())

lbl1=Label(top,text="Data")
lbl1.pack()
ent=Entry(top,bd=1)
ent.pack()

button1=Button(top,text="Submit")
button1.bind("<Button-1>",data)
button1.pack()
top.mainloop()