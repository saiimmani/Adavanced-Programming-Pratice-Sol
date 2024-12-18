import tkinter as tk

def on_close():
    root.destroy()

root = tk.Tk()
root.title("Hello World Example")
root.geometry("200x100")

# Label with green text
label = tk.Label(root, text="Hello, World!", fg="green")
label.pack(pady=20)

root.protocol("WM_DELETE_WINDOW", on_close)
root.mainloop()
