from tkinter import *
top=Tk()
mb=Menubutton(top,text="Menu",relief=RAISED)
mb.grid()
mb.menu=Menu(mb,tearoff=0)
mb["menu"]=mb.menu
mayoVar=IntVar()
ketchvar=IntVar()
mb.menu.add_checkbutton(label="Mayo",variable=mayoVar)
mb.menu.add_checkbutton(label="ketchVar",variable=ketchvar)
mb.pack()
top.mainloop()