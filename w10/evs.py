import socket

def start_udp_server():
    server_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    server_socket.bind(('localhost', 54321))
    print("UDP server is listening on port 54321...")
    
    while True:
        # Receive data from the client
        data, addr = server_socket.recvfrom(1024)
        message = data.decode()
        
        # Check if it's a "UDP Message" packet
        if message == "UDP Message":
            print(f"Received 'UDP Message' from {addr}")
            server_socket.sendto("Acknowledgment: Message received".encode(), addr)
        else:
            # Assume the message is a number, and check if it's even or odd
            try:
                random_number = int(message)
                print(f"Received number {random_number} from {addr}")
                
                if random_number % 2 == 0:
                    result = f"The number {random_number} is Even"
                else:
                    result = f"The number {random_number} is Odd"
                    
                server_socket.sendto(result.encode(), addr)
            except ValueError:
                print(f"Received unknown message from {addr}: {message}")
                server_socket.sendto("Error: Unknown message".encode(), addr)

if __name__ == "__main__":
    start_udp_server()
