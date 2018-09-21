package thread.thread_communication;

public class WaiterThread implements Runnable {
	
	private Object sharedObj;
	private boolean done = false;
	
	WaiterThread(Object sharedObj) {
		this.sharedObj = sharedObj;
	}
	
	public void done() {
		done = true;
	}
	
	public void run() {
		
		System.out.println("I am going to wait till my notifier notice me ....");
		
		/**The current thread must own this object's monitor. The thread 
	     * releases ownership of this monitor and waits until another thread 
	     * notifies threads waiting on this object's monitor */
		
		//synchronized (sharedObj) {
			while(!done) {
				try {
					sharedObj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		//}
		System.out.println("Notified notified my I will continue. Thank you...");
	}

}
