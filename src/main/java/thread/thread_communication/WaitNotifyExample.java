package main.java.thread.thread_communication;

public class WaitNotifyExample {

	public static void main(String[] args) {
		SharedObject obj = new SharedObject();
		obj.specialMethod();
		
		Thread waiter = new Thread(new WaiterThread(obj));
		Thread notifier = new Thread (new NotifierThread(obj));
		
		waiter.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notifier.start();

	}

}

class SharedObject {
	
	public void specialMethod() {
		System.out.println("Special Method ....");
	}
}
