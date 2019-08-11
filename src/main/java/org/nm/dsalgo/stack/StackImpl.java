package org.nm.dsalgo.stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.nm.dsalgo.exceptions.*;

public class StackImpl<T> implements Stack<T> {

	private int capacity;
	private int top = -1;
	private Object[] arr;

	public StackImpl(int capacity) {
		this.capacity = capacity;
		arr = new Object[capacity];
	}

	@Override
	public int getSize() {
		return top + 1;
	}

	@Override
	public void push(T element) throws OverFlowException {
		if (top + 1 >= capacity) {
			throw new OverFlowException("OVERFLOW");
		}
		arr[++top] = element;
	}

	@Override
	public T pop() throws UnderFlowException {
		if (top == -1) {
			throw new UnderFlowException("UNDERFLOW");
		}
		return (T) arr[top--];
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public Iterator<T> getIterator() {
		List<T> list = new ArrayList<T>();
		for(int i = top ; i >= 0 ; i--){
			list.add((T) arr[i]);
		}
		return list.iterator();
	}

	@Override
	public T top()  throws UnderFlowException {
		if (top == -1) {
			throw new UnderFlowException("UNDERFLOW");
		}
		return (T) arr[top];
	}

}
