package main.java.process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DurationTest {
	
	public static void main(String[] args) {
		
		long startTime = 0, endTime = 0, duration = 0;
		startTime = System.currentTimeMillis();
		
		Runtime rt = Runtime.getRuntime();
		System.out.println("Avilable Processors " + rt.availableProcessors());
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader reader = null;
		try {
			
			Process process = rt.exec("cmd.exe  /c  dir");
			is =  process.getInputStream();
			isr = new InputStreamReader(is);
			reader = new BufferedReader(isr);
			
			/* The following statement makes the main.java.process to wait indefinetely */
			//main.java.process.waitFor();
			
			//System.out.println("Exit status = " + main.java.process.exitValue());
			String readLine = reader.readLine(); 
			while(readLine != null) {
				System.out.println(reader.readLine());
				readLine = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} /*catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		finally {
			try {
				reader.close();
				isr.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("Total Duration to execute the main.java.process = " + duration + " Milli seconds");
	}
}
