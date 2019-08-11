package org.nm.dsalgo.ll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedList<T> {

	private LLNode<T> _head;
	private int _size = 0;

	public LinkedList(LLNode<T> head) {
		_head = head;
		_size++;
	}

	public LinkedList(int[] nums){
		if(nums != null && nums.length > 0){
			LLNode head = new LLNodeImpl<Integer>(nums[0]);
			LLNode node = head;
			LLNode next = null;
			_head = head;
			for(int i = 1; i< nums.length ; i++){
				next = new LLNodeImpl<Integer>(nums[i]);
				node.setNext(next);
				node = next;
			}
		}
	}
	
	public LinkedList(T data) {
		this.add(data);
	}

	public void add(T data) {
		LLNode<T> node = new LLNodeImpl<T>(data);
		if (_head != null) {
			LLNode<T> curNode = _head;
			LLNode<T> nextNode = curNode.getNext();
			while (nextNode != null) {
				curNode = nextNode;
				nextNode = nextNode.getNext();
			}
			curNode.setNext(node);
		} else {
			_head = node;
		}
		_size++;
	}

	public void add(LLNode<T> newNode) {
		if (_head != null) {
			LLNode<T> curNode = _head;
			LLNode<T> nextNode = curNode.getNext();
			while (nextNode != null) {
				curNode = nextNode;
				nextNode = nextNode.getNext();
			}
			curNode.setNext(newNode);
		} else {
			_head = newNode;
		}
		_size++;
	}

	public void remove(T data) {
		LLNode<T> prevNode = null;
		LLNode<T> nextNode = _head;
		boolean found = false;
		while (nextNode != null) {
			if (nextNode.getData() == data) {
				found = true;
				break;
			}
			prevNode = nextNode;
		}
		if (found) {
			if (prevNode != null) {
				prevNode.setNext(nextNode.getNext());
			} else {
				this._head = null;
			}
			_size--;

		}
	}

	public T getData() {
		return this._head.getData();
	}
	
	public LLNode<T> getHead(){
		return this._head;
	}
	
	public Iterator<T> getIterator(){
		LLNode<T> node = this._head;
		List<T> list = new ArrayList<T>();
		while(node != null){
			list.add(node.getData());
			node = node.getNext();
		}
		return list.iterator();
	}
}
