import socket

def start_echo_server():
    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    # Set SO_REUSEADDR to allow quick reuse of the socket
    server_socket.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
    server_socket.bind(('localhost', 1234))
    server_socket.listen(1)
    print("TCP echo server is listening on port 1234...")
    
    while True:
        client_socket, addr = server_socket.accept()
        print(f"Connected to {addr}")
        
        while True:
            # Receive the message from the client
            data = client_socket.recv(1024)
            if not data:
                break
            print(f"Received: {data.decode()}")
            
            # Echo the message back to the client
            client_socket.send(data)
        
        client_socket.close()
        print("Connection closed")

if __name__ == "__main__":
    start_echo_server()
