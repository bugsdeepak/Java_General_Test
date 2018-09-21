package network;

import java.net.ServerSocket;

public class ServerSocketBackLogTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			ServerSocket socket = new ServerSocket(5858, 123456);
			
		} catch (Exception ex) {
			System.out.println("problem : " + ex);
			ex.printStackTrace();
			
		}
		

	}

}
