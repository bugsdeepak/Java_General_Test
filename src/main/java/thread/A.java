package main.java.thread;

public class A {
	
	synchronized void mehtodA() {
		A obj = new A();
		//is the following valid
		synchronized (A.class) {
			
		}
		//is the following also valid
		synchronized (obj) {
			
		}
		//and this too ?
		synchronized (this) {
			
		}
	}
	
	public static void main(String[] args) {
		A object  = new A();
		object.mehtodA();
	}
}
