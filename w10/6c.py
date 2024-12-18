import socket
import random

def start_udp_client():
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    server_address = ('localhost', 54321)
    
    # Generate a random number
    random_number = random.randint(1, 100)
    print(f"Sending random number: {random_number}")
    
    # Send the random number to the server
    client_socket.sendto(str(random_number).encode(), server_address)
    
    # Receive the result (even or odd) from the server
    data, _ = client_socket.recvfrom(1024)
    print(f"Received from server: {data.decode()}")
    
    client_socket.close()

if __name__ == "__main__":
    start_udp_client()
