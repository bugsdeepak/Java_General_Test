package main.java.core.errors;

import java.util.HashMap;

public class OutOfMemoryErrorTest {

	private static HashMap<Integer, Object> map = new HashMap<Integer, Object>(23);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0;
		try {
			int n = 10000;
			for(; i<n; i++) {
				
				byte [] bites = new byte[n];
				for(int j=0; j<n; j++) {
					bites[j] = 23;
				}
				map.put(i, bites);
			}
		} catch (OutOfMemoryError er) {
			er.printStackTrace();
			System.out.println("The value of n = " + i);
		}
		
	}	
}
