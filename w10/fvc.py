import socket

def start_udp_client():
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    server_address = ('localhost', 54321)
    
    message = "UDP Message"
    
    # Send a UDP message to the server
    client_socket.sendto(message.encode(), server_address)
    print(f"Sent: {message}")
    
    # Receive acknowledgment from the server
    data, server = client_socket.recvfrom(1024)
    print(f"Received from server: {data.decode()}")
    
    client_socket.close()

if __name__ == "__main__":
    start_udp_client()
