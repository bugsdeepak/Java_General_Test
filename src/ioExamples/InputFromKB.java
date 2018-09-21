package ioExamples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputFromKB {
	
	public static void main(String[] args) {

		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("give your input");
			String s = in.readLine();

			if (s.equals("")) {
				System.out.println("input is empty");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
