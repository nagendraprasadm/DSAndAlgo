package org.nm.dsalgo.ll;

public class LLNodeImpl<T> implements LLNode<T> {

	private T data;
	private LLNode<T> next;
	
	public LLNodeImpl(T data){
		this.data = data;
	}

	@Override
	public T getData() {
		return data;
	}

	@Override
	public void setNext(LLNode<T> next){
		this.next = next;
	}

	@Override
	public LLNode<T> getNext() {
		return next;
	}

	@Override
	public void setData(T data) {
		this.data = data;
	}

}
