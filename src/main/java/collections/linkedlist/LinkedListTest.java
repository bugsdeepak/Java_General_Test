package main.java.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListTest {
	
	public void usingLinkedList() {
		//When you create a linked list object - You do not provide any size
		//as linked list elements are dynamically created and added to the existing LL
		List<Integer> list = new LinkedList<Integer>();
		list.add(123);
		list.add(125);
		list.add(126);
		System.out.println(list.toString());
		//adding elements in between LL is a constant time operation O(1)
		list.add(1, 124);
		System.out.println(list.toString());
		list.get(8);
	}

	public static void main(String[] args) {
		Queue<String> que = new LinkedList<String>();
		que.size();
		new LinkedListTest().usingLinkedList();
	}
}
