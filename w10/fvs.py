import socket

def start_udp_server():
    server_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    server_socket.bind(('localhost', 54321))
    print("UDP server is listening on port 54321...")
    
    while True:
        data, addr = server_socket.recvfrom(1024)
        print(f"Received message from {addr}: {data.decode()}")
        
        # Send an acknowledgment back to the client
        server_socket.sendto("Message received".encode(), addr)

if __name__ == "__main__":
    start_udp_server()
