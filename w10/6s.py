import socket

def start_udp_server():
    server_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    server_socket.bind(('localhost', 54321))
    print("UDP server is listening on port 54321...")
    
    while True:
        # Receive data from the client
        data, addr = server_socket.recvfrom(1024)
        random_number = int(data.decode())
        print(f"Received number {random_number} from {addr}")
        
        # Check if the number is even or odd
        if random_number % 2 == 0:
            result = f"The number {random_number} is Even"
        else:
            result = f"The number {random_number} is Odd"
        
        # Send the result back to the client
        server_socket.sendto(result.encode(), addr)

if __name__ == "__main__":
    start_udp_server()
