package org.nm.dsalgo.queue;

import org.nm.dsalgo.exceptions.OverFlowException;
import org.nm.dsalgo.exceptions.UnderFlowException;

public interface Queue<T> {
	
	public int getSize();
	
	public void enQueue(T data) throws OverFlowException;
	
	public T deQueue() throws UnderFlowException;
	
	public boolean isFull();
	
	public boolean isEmpty();

}
