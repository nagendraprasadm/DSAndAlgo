package org.nm.dsalgo.problems.others;

import org.nm.dsalgo.ll.LLNode;
import org.nm.dsalgo.ll.LLNodeImpl;

public class DeleteNodeLL {

	public void deleteNode(LLNode node) {
		LLNode prev = null;
		LLNode next = null;
		while (node != null) {
			next = node.getNext();
			if (next != null) {
				node.setData(next.getData());
			} else {
				prev.setNext(null);
			}
			prev = node;
			node = next;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LLNode<Integer> node = new LLNodeImpl<Integer>(1);
		LLNode<Integer> next = new LLNodeImpl<Integer>(2);
		node.setNext(next);
		LLNode<Integer> head = node;
		node = next;
		LLNode<Integer> nodeToRemove = head;
		next = new LLNodeImpl<Integer>(3);
		node.setNext(next);
		node = next;
		DeleteNodeLL _instnace = new DeleteNodeLL();
		_instnace.deleteNode(nodeToRemove);
		node = head;
		while (node != null) {
			System.out.println(node.getData() );
			node = node.getNext();
		}

	}

}
