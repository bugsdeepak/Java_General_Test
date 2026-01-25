package main.java.exception;

public class TryCatchReturnTest {
	
	@SuppressWarnings({ "finally", "unused", })
	private static int myPrivateMethod() {
		
		try {
			System.out.println("In try block");
			int i = 10;
			
			//throw new RuntimeException("P:roblemmmmm");
			//@SuppressWarnings("unused")
			//int a = i / 0;
			//System.out.println("value of a = " + a);
			return 1;
			
		} catch (Exception ex) {
			System.out.println("In catch block");
			ex.printStackTrace();
			return 2;
			
		} finally {
			System.out.println("In finally block");
			return 3;
		}
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("finally")
	public static void main(String[] args) {
		
		System.out.println("Output of private method = " + myPrivateMethod());
		
	}

}
