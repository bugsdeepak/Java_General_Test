package thread;

class AutoClose {
	public void send() {
		System.out.println("msg is send");
	}
}

public class ThreadExecution {
	
	public static void main(String[] args) throws Exception {
		
		   Thread one = new Thread(new Runnable() {
	    		public void run() {
	    			System.out.println("First thread started");
	    			new AutoClose().send();
	    			try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    			System.out.println("First thread end");
	    		}});
	    
	    Thread two = new Thread(new Runnable() {
			public void run() {
				System.out.println("Second thread started");
				new AutoClose().send();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Second thread end");
			}});
	    one.start();
	    two.start();
	    //Thread.sleep(10000);
	    System.out.println("I am in main thread");
	}

}
