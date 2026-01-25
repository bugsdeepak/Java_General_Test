package main.java.process;

import java.io.*;

public class BatchFileExecution {

	public static void main(String[] args) {
		
		InputStream in = null;
		InputStreamReader inStr = null;
		BufferedReader buffIn = null;
		
		Process pr = null;
		Runtime rt = Runtime.getRuntime();
		//the location where the command has to be executed.
		//the doulble back slashes are quite important - the separator.
		File location = new File ("F:\\");
		
		try {
			pr = rt.exec("cmd.exe /c dir", null, location );
			
			in = pr.getInputStream();
			inStr = new InputStreamReader(in);
			buffIn = new BufferedReader(inStr);
			
			String readLine = buffIn.readLine(); 
			while(readLine != null) {
				System.out.println(buffIn.readLine());
				readLine = buffIn.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("IO Problem = " + e);
			e.printStackTrace();
		} finally {
			if(pr != null)
				pr.destroy();
			if(buffIn != null)
				try {
					buffIn.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
