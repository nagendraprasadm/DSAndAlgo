package org.nm.dsalgo.ll;

public interface LLNode<T> {
	
	public T getData();

	public void setNext(LLNode<T> next) ;

	public LLNode<T> getNext();
	
	public void setData(T data);
}
