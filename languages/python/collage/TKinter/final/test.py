from tkinter import *
import tkinter.messagebox as tkMessage
root= Tk()
root.title("Example")
root.geometry("500x500")

database={
    "username":"admin",
    "password":"admin@123"
}

def validate():
    try:
        file1=open("demo.txt","r")
        for text in file1:
            lbl=Label(root,text=text,bg="#ffffff",fg="blue",width=50)
            lbl.grid(row=3,column=0,columnspan=2)
    except FileNotFoundError as ex:
        lbl=Label(root,text="File Not Found",bg="#ffffff",fg="blue",width=50)
        lbl.grid(row=3,column=0,columnspan=2)


def signUp():
    file1 = open("demo.txt","w")
    file1.write(text.get())
    lbl=Label(root,text="Registered Successfully",bg="#ffffff",fg="blue",width=50)
    lbl.grid(row=3,column=0,columnspan=2)    

lbl1=Label(root,text="Enter Name")
lbl1.grid(row=0,column=0)
text=Entry(root)
text.grid(row=0,column=1)

lbl2=Label(root,text="Enter Password")
lbl2.grid(row=1,column=0)
text2=Entry(root)
text2.grid(row=1,column=1)

submit = Button(root,text="Submit",command=validate)
submit.grid(row=2,column=0)
register=Button(root,text="Register",command=signUp)
register.grid(row=2,column=1)


root.mainloop()