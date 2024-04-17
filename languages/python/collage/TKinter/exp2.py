import tkinter
import tkinter.messagebox as tkMessageBox


top=tkinter.Tk()
def helloCallBack():
    tkMessageBox.showinfo( "Hello Python", "Hello World")
    button = tkinter.Button(top, text="Hello", command=helloCallBack)
    button.pack()
    top.mainloop()
helloCallBack()