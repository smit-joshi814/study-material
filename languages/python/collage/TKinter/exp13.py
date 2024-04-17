from  tkinter import *
from tkinter import Scrollbar
from tkinter import Listbox
root=Tk()
scrollbar=Scrollbar(root)
scrollbar.pack(side=RIGHT,fill=Y)
myList=Listbox(root,yscrollcommand=scrollbar.set)
for line in range(100):
    myList.insert(END,"This is line Number" +str(line))

myList.pack(side=LEFT,fill=BOTH)
scrollbar.config(command=myList.yview)
mainloop()