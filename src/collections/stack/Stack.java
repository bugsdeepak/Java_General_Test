package collections.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
	
	private int maxSize;
	private List<T> elements = null;
	private int index;
	
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		elements = new ArrayList<>(maxSize);
	}
	
	public int getSize() {
		return index;
	}
	
	public boolean isEmpty() {
		return index == 0;
	}
	
	public boolean isFull() {
		return index == maxSize;
	}
	
	public boolean push (T t) {
		if(index == maxSize) {
			return false;
		} else {
			elements.add(t);
			index++;
			return true;
		}
	}
	
	public T pop() throws StackUnderFlowException {
		T e;
		if(index < 1) {
			throw new StackUnderFlowException(index, "Stack has No Element");
		} else {
			e = elements.get(index-1);
			elements.remove(index-1);
			index--;
			return e;
		}
	}
}