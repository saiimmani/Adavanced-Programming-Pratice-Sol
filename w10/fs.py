import socket

def start_tcp_server():
    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server_socket.bind(('localhost', 12345))
    server_socket.listen(1)
    print("TCP server is listening on port 12345...")

    while True:
        client_socket, addr = server_socket.accept()
        print(f"Connected to {addr}")
        
        # Receive the list of numbers from the client
        data = client_socket.recv(1024).decode()
        numbers = list(map(int, data.split(',')))
        
        # Calculate the sum of numbers
        result = sum(numbers)
        print(f"Received numbers: {numbers}, Sum: {result}")
        
        # Send the sum back to the client
        client_socket.send(str(result).encode())
        
        client_socket.close()

if __name__ == "__main__":
    start_tcp_server()
