from tkinter import *
root=Tk()
lblFrame=LabelFrame(root,text="This is a LabelFrame")
lblFrame.pack(fill="both",expand="yes")
left=Label(lblFrame,text="Inside the LabelFrame")
left.pack()
root.mainloop()