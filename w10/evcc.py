import socket

def start_tcp_client():
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client_socket.connect(('localhost', 12345))  # Match the server's port
    print("Connected to the server")

    message = "Hello, Server!"
    client_socket.send(message.encode())
    data = client_socket.recv(1024)
    print(f"Received from server: {data.decode()}")

    client_socket.close()

if __name__ == "__main__":
    start_tcp_client()
