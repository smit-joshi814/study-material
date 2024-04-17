import tkinter
top =tkinter.Tk()
canvas=tkinter.Canvas(top,bg="blue",height=250,width=300)
cooard=10,50,240,210
arc=canvas.create_arc(cooard,start=0,extent=150,fill="red")
canvas.pack()
top.mainloop()