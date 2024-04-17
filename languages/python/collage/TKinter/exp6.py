from tkinter import *
root=Tk()

frame=Frame(root)
frame.pack()
bottomFrame=Frame(root)
bottomFrame.pack(side=BOTTOM)
redButton=Button(frame,text="Red",fg="red").pack(side=LEFT)
greenButton=Button(frame,text="Green",fg="green").pack(side=RIGHT)
buleButton=Button(frame,text="Bule",fg="blue").pack(side=TOP)
blackButton=Button(bottomFrame,text="Black",fg="black").pack(side=BOTTOM)
root.mainloop()