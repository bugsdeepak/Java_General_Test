package thread.thread_communication;

public class NotifierThread implements Runnable {
	
	private Object sharedObj;
	
	NotifierThread(Object sharedObj) {
		this.sharedObj = sharedObj;
	}
	
	public void run() {
		
		System.out.println("I am done ");
		sharedObj.notify();
		System.out.println(" THank you....");
	}

}
