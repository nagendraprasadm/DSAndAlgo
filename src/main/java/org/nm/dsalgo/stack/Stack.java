package org.nm.dsalgo.stack;

import java.util.Iterator;

import org.nm.dsalgo.exceptions.*;

public interface Stack<T> {
	
	public int getSize();
	public void push(T element) throws OverFlowException;
	public T pop() throws UnderFlowException;
	public T top()  throws UnderFlowException ;
	public boolean isEmpty();
	public Iterator<T> getIterator();

}
