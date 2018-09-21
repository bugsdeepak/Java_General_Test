package thread.atmoic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariableExample {
	
	public static void main(String[] args) {
		
	}
}

class Page1 {
	private static int hitCount;
	
	public void increment() {
		hitCount++;
	}
	
	public void printHitCount() {
		System.out.println("Hit count : " + hitCount);
	}
}

class Page2 {
	private static AtomicInteger hitCount = new AtomicInteger();
	
	public void increment() {
		hitCount.incrementAndGet();
	}
	
	public void printHitCount() {
		System.out.println("Hit count : " + hitCount);
	}
}