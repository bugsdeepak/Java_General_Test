package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class FinallyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			System.out.println("try block executed");
			int a = 0/0;
			FileInputStream is = new FileInputStream("asdfasdf");
		} catch(IOException ex) {
			System.out.println("catch block executed");
		} finally {
			System.out.println("Finally block executed");
		}

	}

}
