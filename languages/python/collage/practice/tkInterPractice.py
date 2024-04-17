from tkinter import *
import tkinter.messagebox as tkMessageBox

def fact(n):
    if n==1:
        return n
    else:
        return n*fact(n-1)

def data(event):
    data=int(txtBox.get())
    tkMessageBox.showinfo("Factorial is",str(fact(data)))

root=Tk()
root.geometry("200x200")

lbl=Label(root,text="hello")
txtBox=Entry(root)
btn=Button(root,text="Submit")
btn.bind("<Button>",data)
lbl.pack()
txtBox.pack()
btn.pack()

root.mainloop()