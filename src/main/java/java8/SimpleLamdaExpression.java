package main.java.java8;

public class SimpleLamdaExpression {

	public static void main(String[] args) {
		
		/**
		 * Lambda expressions replace the use of anonymous class.
		 * 
		 */
		
		/*Runnable runnable = new Runnable() {
			public void run() {
				for(byte b=0; b<3; b++) {
					System.out.println("Hello World From Thread  [ " 
							+ Thread.currentThread().getName() + " ]");
				}
			}
		};*/
		
		
		Runnable runnableLambda = () ->  {
			for(byte b=0; b<3; b++) {
				System.out.println("Hello World From Thread  [ " 
						+ Thread.currentThread().getName() + " ]");
			}
		};
		
		Thread t = new Thread(runnableLambda, "My Test Thread");
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
