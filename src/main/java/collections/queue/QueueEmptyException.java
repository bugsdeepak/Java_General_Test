package main.java.collections.queue;

public class QueueEmptyException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public QueueEmptyException() {
	}
	
	public String toString() {
		return "Queue Is Empty";
	}
}
