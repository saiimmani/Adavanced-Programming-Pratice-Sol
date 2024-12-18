import tkinter as tk

root = tk.Tk()
root.title("Absolute Positioning Example")
root.geometry("400x300")

# Label with blue text
label = tk.Label(root, text="Enter your name:", fg="blue")
label.place(x=50, y=50, width=120, height=30)

# Entry widget
entry = tk.Entry(root)
entry.place(x=180, y=50, width=150, height=30)

# Button with blue background
button = tk.Button(root, text="Submit", bg="blue", fg="white")
button.place(x=150, y=100, width=100, height=30)

root.mainloop()
