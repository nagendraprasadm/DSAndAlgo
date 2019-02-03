package org.nm.dsalgo.queue;

import org.nm.dsalgo.exceptions.OverFlowException;
import org.nm.dsalgo.exceptions.UnderFlowException;

public class QueueImpl<T> implements Queue<T> {

	private int _capacity;
	private Object[] _arr;
	private int _size = 0;
	private int _head = -1;

	public QueueImpl(int capacity) {
		this._capacity = capacity;
		this._arr = new Object[capacity];
	}

	@Override
	public int getSize() {
		return _size;
	}

	@Override
	public void enQueue(T data) throws OverFlowException {
		if(isFull()){
			throw new OverFlowException("OVERFLOW");
		}else{
			if(_head == -1){
				_arr[++_head] = data;
				_size++;
			}else{
				_arr[_head + _size++] = data;
			}
		}

	}

	@Override
	public T deQueue() throws UnderFlowException {
		if(isEmpty()){
			throw new UnderFlowException("UNDERFLOW");
		}else{
			_size--;
			return (T)_arr[_head++];
		}
	}

	@Override
	public boolean isFull() {
		return _size == _capacity;
	}

	@Override
	public boolean isEmpty() {
		return _size == 0;
	}

}
