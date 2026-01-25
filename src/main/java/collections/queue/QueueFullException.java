package main.java.collections.queue;

public class QueueFullException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private int queueSize;
	
	public QueueFullException(int size) {
		this.queueSize = size;
	}
	
	public String toString() {
		return "Queue Is Full, Size : " + queueSize;
	}

}
