import socket
def start_file_server():
    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server_socket.bind(('localhost', 1234))
    server_socket.listen(1)
    print("TCP file server is listening on port 12346...")
    while True:
        client_socket, addr = server_socket.accept()
        print(f"Connected to {addr}")
        
        # Open a file to write the received data
        with open("received_file.txt", "wb") as file:
            print("Receiving file...")
            while True:
                data = client_socket.recv(1024)
                if not data:
                    break
                file.write(data)
        
        print("File received and saved successfully")
        client_socket.close()

if __name__ == "__main__":
    start_file_server()
