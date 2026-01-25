package main.java.collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListTest {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

        Queue q = new LinkedList();
        q.add("Trichy");
        q.add("Thanjavur");
        q.add(new Integer(10));
        while(!q.isEmpty()) {
        	//poll -> Retrieves and removes the head of this queue, or returns null if this queue is empty.
        	System.out.println(q.poll());
        }
	}
}
