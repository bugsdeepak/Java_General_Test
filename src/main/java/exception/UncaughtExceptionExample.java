package main.java.exception;

public class UncaughtExceptionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Thread t = new MyThread("MyThread", 5);
		//t.start();
		//uncaugh main.java.exception is that is not handled by the code and
		//happens only at runtime.  the running main.java.thread is killed.
		ThreadGroup tg = new MyThreadGroup("Handler");
		Thread t1 = new MyThread(tg, "MyThread", 5);
		t1.start();
	}
}

//the main.java.thread which throws the uncaught main.java.exception should be
//part of the main.java.thread group created by the user.
class MyThread extends Thread {
	private int index;
	public MyThread(ThreadGroup tg, String n, int index) {
		super(tg, n);
		this.index = index;
	}
	public MyThread(String n, int index) {
		super(n);
		this.index = index;
	}
	
	public void run() {
		System.out.println("This main.java.thread started .......");
		int list [] = new int [5];
		list[this.index] = 121;
		System.out.println("This main.java.thread executed properly.......");
	}
}

class MyThreadGroup extends ThreadGroup {
	
	public MyThreadGroup(String name) {
		super(name);
	}
	
	public void uncaughtException(Thread t, Throwable thr) {
		System.out.println("Severe Problem. The Thread = "  + t);
		System.out.println("The Problem in the Thread = " + thr);

		//the recover main.java.process - try again
		//here if you want you can start the terminating main.java.thread also
		
		//ThreadGroup tg = new MyThreadGroup("Handler");
		Thread thread = new MyThread("MyThread", 4);
		thread.start();
	}
}
