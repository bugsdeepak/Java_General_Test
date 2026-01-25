package main.java.network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class ServerSocketBindTest {
	
    public ServerSocket createServerSocket(int port,  int backlog) 
                  throws IOException {
    	InetAddress ifAddress =  null;
		ServerSocket ss = createSocket();
		ss.bind(new InetSocketAddress(port), backlog);
		//ss.bind(new InetSocketAddress(ifAddress, port), backlog);
		
		return ss;
    }
    
    private ServerSocket createSocket() throws IOException {
    	
    	ServerSocket ss = new ServerSocket();
    	//the method setReuseAddress() used for - can the same port be used 
    	//for the new socket i.e two sockets at the same port.
        ss.setReuseAddress(false);
    	System.out.println( "The timeout value = " + ss.getSoTimeout());
        return ss;
    	
    }
	
	public static void main(String[] args) throws Exception {
		
		ServerSocketBindTest ssbt;
		try {
			
			ssbt = new ServerSocketBindTest();
			//if the port number is zero a dynamic port is assigned. any port that is free
			//ServerSocket ss = ssbt.createServerSocket(0, 100);
			ServerSocket ss = ssbt.createServerSocket(49491, 100);
			//ServerSocket ss1 = ssbt.createServerSocket(49491, 100);
			System.out.println("The Socket Info = " + ss);
			ss.accept();
			//ss.close();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
