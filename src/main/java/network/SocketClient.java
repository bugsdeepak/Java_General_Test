package main.java.network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//this is the socket client program, when creating a socket object
		//with the hostname and port number, the connection created between the client and server.
		
		//the client program mostly reside in a different machine. The client should aware
		//of the remote hostname and port. 
		
		//For every socket there are two port. Local port and remote port.
		//to get local port Socket.getLocalPort() and remote port, Socket.getPort().
		
		//The local port is the one on the local machine, which used to connect to the host.
		//The remote port is one on the remote machine. For the client program the local port
		//will vary and the remote port is fixed one.
		
		try {
			Socket sck = new Socket("localhost", 7676);
			System.out.println("connection established");
			System.out.println("Socket details = " + sck);
			
			OutputStream output = sck.getOutputStream();
			output.write(127);
			System.out.println("Send data to client");
			
			sck.close();
			System.out.println("connection closed");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
