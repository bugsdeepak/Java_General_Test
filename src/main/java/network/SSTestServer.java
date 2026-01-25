package main.java.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SSTestServer {
    public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = null;
		boolean reallyexit = false;

		try {
			serverSocket = new ServerSocket(5555, 0);
		} catch (IOException e) {
			System.err.println("Could not listen on port: 5555.");
			System.err.println(e.getMessage());
			System.exit(1);
		}

		while (!reallyexit) {

			Socket clientSocket = null;
			try {
				clientSocket = serverSocket.accept();
			} catch (IOException e) {
				System.err.println("Accept failed.");
				System.err.println(e.getMessage());
				System.exit(1);
			}

			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),
					true);
			BufferedReader in = new BufferedReader(new InputStreamReader(
					clientSocket.getInputStream()));
			String inputLine, outputLine;

			outputLine = "Connection Accepted";
			out.println(outputLine);

			while ((inputLine = in.readLine()) != null) {
				if (inputLine.equals("Bye for ever!")) {
					System.out.println("terminate all sessions");
					out.println("Bye.");
					reallyexit = true;
					break;
				}
				if (inputLine.equals("Bye.")) {
					System.out.println("terminate this session");
					out.println("Bye.");
					break;
				}
				outputLine = "echo: " + inputLine;
				out.println(outputLine);
				System.out.println(inputLine);
			}
			out.close();
			in.close();
			clientSocket.close();
		}
		serverSocket.close();
	}
}

