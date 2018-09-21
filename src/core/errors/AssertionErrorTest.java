package core.errors;

public class AssertionErrorTest {

	/**
	  Assertion : use assertion to test our assumption about programs. 
	  That means it validates our program Assertions ensures the program 
	  validity by catching exceptions and logical errors. 
	  They can be stated as comments to guide the programmer 
	  if-else statement should be used for program flow control and the assert keyword 
	  should only be used for testing purposes
	 */
	public static void main(String[] args) {
		/* Assertions are of two types.
		 * 1. Precondition - invoked when a method is invoked
		 * 2. Postcondition- invoked when a method finished 
		 * 
		 * When you run this program you have to enable Assertion by 
		 * passing the JVM the argument "-ea". For example when you run
		 * this program on command prompt java -ea AssertionErrorTest */
		int i = 10, j = 20;
		assert i == j : i + " and " + j + " are not equal";

	}

}
