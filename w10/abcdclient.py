import socket

def start_echo_client():
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client_socket.connect(('localhost', 1234))

    while True:
        # Take input from the user
        message = input("Enter message to send to the server (type 'exit' to quit): ")
        
        if message.lower() == 'exit':
            break
        
        # Send the message to the server
        client_socket.send(message.encode())
        
        # Receive the echoed message from the server
        data = client_socket.recv(1024).decode()
        print(f"Echoed back from server: {data}")
    
    client_socket.close()

if __name__ == "__main__":
    start_echo_client()
