import socket
import random

def send_udp_message():
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    server_address = ('localhost', 54321)
    
    # Send the "UDP Message"
    message = "UDP Message"
    print(f"Sending: {message}")
    client_socket.sendto(message.encode(), server_address)
    
    # Receive the acknowledgment from the server
    data, _ = client_socket.recvfrom(1024)
    print(f"Received from server: {data.decode()}")
    
    client_socket.close()

def send_random_number():
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    server_address = ('localhost', 54321)
    
    # Generate a random number
    random_number = random.randint(1, 100)
    print(f"Sending random number: {random_number}")
    
    # Send the random number to the server
    client_socket.sendto(str(random_number).encode(), server_address)
    
    # Receive the result from the server
    data, _ = client_socket.recvfrom(1024)
    print(f"Received from server: {data.decode()}")
    
    client_socket.close()

if __name__ == "__main__":
    send_udp_message()  # Send the "UDP Message"
    send_random_number()  # Send a random number to check if it's even or odd
