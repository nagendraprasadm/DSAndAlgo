package org.nm.dsalgo.problems.ll;

import org.nm.dsalgo.ll.LLNode;
import org.nm.dsalgo.ll.LLNodeImpl;

public class EvenOddList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EvenOddList _instance = new EvenOddList();
		LLNode node = new LLNodeImpl(1);
		LLNode head = node;
		LLNode next = new LLNodeImpl(1);
		node.setNext(next);
		node = next;
/*		next = new LLNodeImpl(3);
		node.setNext(next);
		node = next;
		next = new LLNodeImpl(4);
		node.setNext(next);
		node = next;
		next = new LLNodeImpl(5);
		node.setNext(next);*/
		head = _instance.oddEvenList(head);
		node = head;
		while (node != null) {
			System.out.print(node.getData() + "->");
			node= node.getNext();
		}

	}

	public LLNode<Integer> oddEvenList(LLNode<Integer> head) {
		int count = 0;
		if (head != null) {
			count++;
			int size = 0;
			LLNode<Integer> tail = null, cur = null, prev = null, next = null;
			cur = head;
			while (cur != null) {
				tail = cur;
				cur = cur.getNext();
				size++;
			}
			if(size > 2){
				cur = head;
				prev = head;
				while (cur != null && count <= size) {
					if (count % 2 == 0) {
						prev.setNext(cur.getNext());
						tail.setNext(cur);
						next = cur.getNext();
						cur.setNext(null);
						tail = cur;
					} else {
						prev = cur;
						next = cur.getNext();
					}
					cur = next;
					count++;
				}
			}
		}
		return head;
	}

}
