package collections.queue;

import collections.stack.Stack;
import collections.stack.StackUnderFlowException;

/**
 * Create an implementation of the Queue using two stacks.
 * When elements are added they are done in stack1.
 * when elements are removed they are done from stack2.
 * The current size of the queue is > 1 AND < (2 * size of stack)
 * 
 * @author abened
 *
 * @param <T>
 */
public class QueueUsingStack<T> {
	
	private int curSize;
	Stack<T> stack1 = null; 
	Stack<T> stack2 = null;
	
	public QueueUsingStack(int size) {
		stack1 = new Stack<T>(size);
		stack2 = new Stack<T>(size);
	}
	
	/**
	 * The current size of the queue is > 1 AND < (2 * size of stack)
	 */
	public int getSize() {
		return curSize;
	}
	
	/**
	 * push the element to stack1 till it is full.
	 * once it reached its maximum size, pop all elements from stack1 and
	 * push to stack2
	 * 
	 * @param t
	 * @throws QueueFullException
	 */
	public void enqueue(T t) throws QueueFullException  {
		boolean pushSuccess = false;
		//All new coming elements are pushed into stack1
		if(stack1.isFull()) {
			throw new QueueFullException(curSize);
		} else {
			pushSuccess = stack1.push(t);
			if(!pushSuccess)
				throw new QueueFullException(curSize);
			curSize++;
		}
		
		//pop all elements from stack1 and push it to stack2 - ONLY when Stack1 is full AND Stack2 is empty
		if(stack1.isFull() && stack2.isEmpty()) {
			trasferStacks();
		}
	}
	
	/**
	 * First check stack2 has elements, if it has just pop them out.
	 * If stack2 does not have any elements then check stack1
	 * If stack1 also has no elements throw queue is empty
	 * other wise take all elements from stack1 and put them on stack2 for retrieval
	 * 
	 * @return the element
	 * @throws QueueEmptyException
	 */
	public T dequeue() throws QueueEmptyException {
		T e = null;
		if(stack2.isEmpty()) {
			if(stack1.isEmpty()) {
				throw new QueueEmptyException();
			} else {
				trasferStacks();
			}
		}
		try {
			e = stack2.pop();
			curSize--;
		} catch (StackUnderFlowException exp) {
			exp.printStackTrace();
		}
		return e;
	}
	
	private void trasferStacks() {
		while(!stack1.isEmpty()) {
			try {
				stack2.push(stack1.pop());
			} catch (StackUnderFlowException exp) {
				//this should not occur as we have while condition
				exp.printStackTrace();
			}
		}
	}
}
