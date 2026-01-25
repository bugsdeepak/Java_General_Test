package main.java.abstractex;

public class TestStatic1 {
	
	private static int count;
	
	public static void increment() {
		count++;
		System.out.println(" Count value : " + count);
	}
	
	public void callme() {
		TestStatic.increment();
		TestStatic.increment();
	}
	public static void main(String[] args) throws Exception {
		
		TestStatic.increment();
		TestStatic.increment();
		System.out.println("Sleeping ");
		//Thread.sleep(10000);
		TestStatic.increment();
		new TestStatic1().callme();
		new TestStatic().callme();
		new TestStatic().main(null);
	}

}
