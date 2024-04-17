from tkinter import *
from tkinter import IntVar
top=Tk()
CheckVar1=IntVar()
CheckVar2=IntVar()
chk1=Checkbutton(top,text="Music",variable=CheckVar1,onvalue=1,offvalue=0,height=5,width=20)
chk2=Checkbutton(top,text="Video",variable=CheckVar2,onvalue=1,offvalue=0,height=5,width=20)
chk1.pack()
chk2.pack()
top.mainloop()