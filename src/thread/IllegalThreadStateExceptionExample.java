package thread;

public class IllegalThreadStateExceptionExample {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new MyThread());
		
		thread.start();
		//It is never legal to start a thread more than once.
		//but if we do so, then IllegalThreadStateException - a RuntimeException
		//will be thrown.
		thread.start();
		//The reason could be, once the thread finishes we cannot call again.
		//if we want to do so, then we have to do it in another thread object.
		Thread anotherThread = new Thread(new MyThread());
		anotherThread.start();

	}

}
