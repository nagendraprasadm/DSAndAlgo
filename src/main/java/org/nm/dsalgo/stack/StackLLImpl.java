package org.nm.dsalgo.stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.nm.dsalgo.ll.LLNode;
import org.nm.dsalgo.ll.LLNodeImpl;
import org.nm.dsalgo.exceptions.OverFlowException;
import org.nm.dsalgo.exceptions.UnderFlowException;

public class StackLLImpl<T> implements Stack<T> {

	private int capacity;
	private int size = 0;
	private LLNode<T> head;

	public StackLLImpl(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void push(T element) throws OverFlowException {
		if (size >= capacity) {
			throw new OverFlowException("OVERFLOW");
		}
		LLNode<T> newNode = new LLNodeImpl(element);
		if (size == 0) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
		size++;
	}

	@Override
	public T pop() throws UnderFlowException {
		if (size == 0) {
			throw new UnderFlowException("UNDERFLOW");
		}
		LLNode<T> temp = head;
		LLNode<T> newHead = temp.getNext();
		head = newHead;
		size--;
		return temp.getData();
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Iterator<T> getIterator() {
		LLNode<T> node = head;
		List<T> list = new ArrayList<T>();
		while (node != null) {
			list.add(node.getData());
			node = node.getNext();
		}
		return list.iterator();
	}

	@Override
	public T top()  throws UnderFlowException {
		// TODO Auto-generated method stub
		return null;
	}

}
