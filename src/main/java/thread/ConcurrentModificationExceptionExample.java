package main.java.thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionExample {
	
	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		
		strList.add("antony");
		strList.add("deepak");
		strList.add("muthu");
		strList.add("kumar");
		
		Iterator<String> itr = strList.iterator();
		
		while(itr.hasNext()) {
			System.out.println("The value = "+ itr.next());
			//Even though generally we cannot modify the collection when
			//iterating on it. We can still REMOVE an element of its own
			//remove method.
			itr.remove();
		}
		
		//the below code will create an iterator on strList and 
		//iterate on it.
		for(String str : strList) {

			//both the add method and the remove method will throw
			//ConcurrentModificationException.
			
			//The main.java.exception is not thrown by the addition/removing code
			//rather by the ITERATOR.....
			
			strList.remove(str);
			strList.add("sundar");
		}
		
		
		
	}
}
