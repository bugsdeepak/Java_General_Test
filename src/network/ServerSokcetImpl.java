package network;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSokcetImpl {
	
	private static int clientCnt;
	private static final int MAX_NUM_CLIENTS = 5;

	public static void main(String[] args) {

		InputStream is = null;
		ServerSocket svrSck = null;
		try {
			//serversocket should be created once and the same should be used.
			svrSck = new ServerSocket(7676, 100);
		} catch (IOException e) {
			System.out.println("Server Socket cannot be created...");
			e.printStackTrace();
		}
		
		while (svrSck != null && clientCnt < MAX_NUM_CLIENTS) {
			if(clientCnt ==0)
				System.out.println("Server Started");
			try {

				Socket sck = svrSck.accept();
				System.out.println("Got " + ++clientCnt  + " client... Details = " + sck);
				
				//get the data from the client
				is = sck.getInputStream();
				System.out.println("Got Data From client = " + is.read());

			} catch (Exception ex) {
				System.out.println("Problem..... " + ex);
				ex.printStackTrace();
				if (svrSck != null) {
					try {
						svrSck.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					svrSck = null;
				}
				if(is != null)
					try {
						is.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				
			} finally {
				
			}
		}
	}
}
