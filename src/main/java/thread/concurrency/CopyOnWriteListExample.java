package main.java.thread.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteListExample implements Runnable {
	
	private List<String> conStrList = new CopyOnWriteArrayList<String>();
	private static int i;
	
	public void run() {
		conStrList.add("Element" + i);
		i++;
	}
	
	public void addElements() {
		conStrList.add("Antony");
		conStrList.add("Deepak");
		conStrList.add("Sundar");
	}
	
	public void printElement() {
		for(String str: conStrList) {
			System.out.println("Element : " + str);
		}
	}
	
	public void printSize(){
		System.out.println("List Size : " + conStrList.size());
	}
	
	public void addElementsWhileIterating() {
		
		//though the elements in the list are modified - no ConcurrentModification
		//Exception is thrown
		for(String str: conStrList) {
			conStrList.add("kumar");
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		CopyOnWriteListExample obj = new CopyOnWriteListExample();
		obj.addElements();
		obj.printSize();
//		obj.addElementsWhileIterating();
//		obj.printElement();
		
		//multi threaded
		new Thread(obj).start();
		obj.printSize();
		new Thread(obj).start();
		new Thread(obj).start();
		//the size of the elements in the list are not consistent. 
		//since multiple threads can add/remove elements concurrently
		obj.printSize();
		//to see all the added elements make the main main.java.thread to sleep
		Thread.sleep(3000);
		obj.printElement();
	}
}
