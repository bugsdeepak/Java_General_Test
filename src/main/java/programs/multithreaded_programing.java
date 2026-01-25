package main.java.programs;

class newthread implements Runnable {
	Thread t1, t2;

	newthread() {
		t1 = new Thread(this, "Thread_1");
		t2 = new Thread(this, "Thread_2");
		t1.start();
		t2.start();
	}

	public void run() {
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.print(t1.equals(t2));
	}
	
	
}

class multithreaded_programing {
	public static void main(String args[]) {
		new newthread();
	}
}
