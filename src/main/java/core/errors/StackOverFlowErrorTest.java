package main.java.core.errors;

public class StackOverFlowErrorTest {
	
	public static void method1(int i) {
		method2(i);
	}
	
	public static void method2(int j) {
		method3(j);
	}

	private static void method3(int k) {
		method1(k);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* Executing the following code will result in StackOverFlowError.
		 * The reason: when ever a new method is called the arguments are pushed
		 * into the stack and new method is called. Hence in the flow we have
		 * a cyclic dependency created where method calls goes indefinetely and
		 * when the stack memory is full, it give the Error and the JVM exit.
		 * A snapshot of the main.java.exception stack trace.........
		 * Exception in main.java.thread "main" java.lang.StackOverflowError
	       at main.java.common.StackOverFlowTest.method3(StackOverFlowTest.java:14)
	       at main.java.common.StackOverFlowTest.method2(StackOverFlowTest.java:10)
	       at main.java.common.StackOverFlowTest.method1(StackOverFlowTest.java:6) */
		method1(20);
		
	}

}
