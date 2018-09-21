package abstractex;

public class TestStatic {
	
	private static int count;
	
	public static void increment() {
		count++;
		System.out.println(" Count value : " + count);
	}
	
	public void callme() {
		TestStatic.increment();
		TestStatic.increment();
	}
	
	public static void main(String[] args) {
		
		TestStatic.increment();
		TestStatic.increment();
		TestStatic.increment();
	}

}
