package main.java.thread.concurrency;

import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest implements Runnable {
	
	private ConcurrentHashMap<String, String> hashMap = new ConcurrentHashMap<String, String>();
	private static int i;
	
	public void run() {
		hashMap.put(""+i, "Element "+i );
		i++;
	}
	
	public void addElements() {
		hashMap.put(""+i, "Antony");
		i++;
		hashMap.put(""+i, "Deepak");
		i++;
	}
	
	public void printElements() {
		
		Enumeration<String> mapElements = hashMap.elements();
		while(mapElements.hasMoreElements()){
			System.out.println("Element: " + mapElements.nextElement());
		}
	}
	
	public void printSize() {
		System.out.println("HashMap Size : " + hashMap.size());
	}
	
	public static void main(String[] args) throws Exception {
		
		ConcurrentHashMapTest obj = new ConcurrentHashMapTest();
		
		//multi threaded
		obj.addElements();
		obj.printElements();
		new Thread(obj).start();
		obj.printSize();
		new Thread(obj).start();
		new Thread(obj).start();
		Thread.sleep(3000);
		obj.printElements();
		obj.printSize();
		
	}
}
