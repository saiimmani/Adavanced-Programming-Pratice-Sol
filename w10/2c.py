import socket

def start_file_client():
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client_socket.connect(('localhost', 1234))
    
    # Open the file to be sent
    file_path = "small_text_file.txt"  # Replace with the path of your small text file
    with open(file_path, "rb") as file:
        print("Sending file...")
        while chunk := file.read(1024):
            client_socket.send(chunk)
    
    print("File sent successfully")
    client_socket.close()

if __name__ == "__main__":
    start_file_client()
