package collections.stack;

import collections.queue.QueueUsingStack;

public class StackQueueTest {
	
	public static void main(String[] args) throws Exception {
		
		Stack<Integer> myStack = new Stack<Integer>(10);
		
		myStack.push(12);
		myStack.push(13);
		myStack.push(14);
		myStack.push(15);
		try {
			System.out.println(" POP = " + myStack.pop());
			System.out.println(" POP = " + myStack.pop());
			System.out.println(" POP = " + myStack.isEmpty());
			System.out.println(" POP = " + myStack.pop());
			System.out.println(" POP = " + myStack.pop());
			System.out.println(" POP = " + myStack.isEmpty());
		} catch (StackUnderFlowException e) {
			e.printStackTrace();
		}
		
		QueueUsingStack<String> queue = new QueueUsingStack<>(5);
		queue.enqueue("Antony");
		queue.enqueue("Deepak");
		queue.enqueue("Deepak1");
		queue.enqueue("Deepak2");
		queue.enqueue("Deepak3");
		//System.out.println(" Queue o/p = " + queue.dequeue());
		queue.enqueue("Vikalp");
		//System.out.println(" Queue o/p = " + queue.dequeue());
		queue.enqueue("Muthu");
		//System.out.println(" Queue o/p = " + queue.dequeue());
		//System.out.println(" Queue o/p = " + queue.dequeue());
		System.out.println(" Queue o/p = " + queue.dequeue());
		System.out.println(" Queue o/p = " + queue.dequeue());
		System.out.println(" Queue o/p = " + queue.dequeue());
		System.out.println(" Queue o/p = " + queue.dequeue());
	}

}
