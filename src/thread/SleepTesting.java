package thread;

class FirstThread extends Thread {
	
	public void run() {
		
		for(int i=1; i <=10; i++) {
			System.out.println("First Thread Loop value = " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("First Thread Completed.....");
	}
}

class SecondThread extends Thread {
	
	public void run() {
		
		for(int i=1; i <=10; i++) {
			System.out.println("Second Thread Loop value = " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Second Thread Completed.....");
	}
}

public class SleepTesting {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread first  = new FirstThread();
		Thread second = new SecondThread();
		
		first.start();
		second.start();
		
		first.join();
		second.join();
		
	}
}

