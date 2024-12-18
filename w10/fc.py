import socket

def start_tcp_client(numbers):
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client_socket.connect(('localhost', 12345))
    
    # Send the list of numbers to the server
    numbers_str = ','.join(map(str, numbers))
    client_socket.send(numbers_str.encode())
    
    # Receive the sum from the server
    result = client_socket.recv(1024).decode()
    print(f"Sum of numbers received from the server: {result}")
    
    client_socket.close()

if __name__ == "__main__":
    numbers_to_send = [5, 10, 15, 20]
    start_tcp_client(numbers_to_send)
