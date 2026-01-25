package main.java.collections.linkedlist;

public class LinkedList<T> {
	
	Node<T> head;
	static class Node<T> {
		T t;
		Node<T> next;
		Node(T element) {
			this.t=element;
			this.next=null;
		}
	}
}
