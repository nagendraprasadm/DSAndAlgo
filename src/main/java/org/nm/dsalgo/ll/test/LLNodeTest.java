package org.nm.dsalgo.ll.test;

import org.nm.dsalgo.ll.LLNode;
import org.nm.dsalgo.ll.LLNodeImpl;

public class LLNodeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		LLNode<Integer> prev;
		LLNode<Integer> head;
		LLNode<Integer> node = new LLNodeImpl<Integer>(1);
		prev = node;
		head = node;
		node = new LLNodeImpl<Integer>(2);
		prev.setNext(node);
		prev = node;
		node = new LLNodeImpl<Integer>(3);
		prev.setNext(node);
		node = head;
		while (node != null) {
			System.out.println(node.getData());
			node = node.getNext();
		}
	}

}
