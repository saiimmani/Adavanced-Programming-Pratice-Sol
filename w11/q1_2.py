import tkinter as tk

root = tk.Tk()
root.title("Pack Method Example")
root.geometry("300x200")

# Label with black text
label = tk.Label(root, text="Enter your name:", fg="black")
label.pack(side=tk.TOP, fill=tk.X)

# Entry widget
entry = tk.Entry(root)
entry.pack(side=tk.TOP, fill=tk.X, padx=10, pady=5)

# Button with black background
button = tk.Button(root, text="Submit", bg="black", fg="white")
button.pack(side=tk.BOTTOM, fill=tk.X)

root.mainloop()
