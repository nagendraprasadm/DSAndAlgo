package org.nm.dsalgo.problems.ll;

import org.nm.dsalgo.ll.LLNode;
import org.nm.dsalgo.ll.LLNodeImpl;
import org.nm.dsalgo.ll.LinkedList;

public class MergeList {

	public LLNode<Integer> mergeSortedList(LLNode<Integer> root1,
			LLNode<Integer> root2) {
		if (root1 != null && root2 != null) {
			if (root1.getData() > root2.getData()) {
				return processRoots(root2, root1);
			} else {
				return processRoots(root1, root2);
			}
		} else {
			if (root1 != null && root2 == null) {
				return root1;
			} else if (root1 == null && root2 != null) {
				return root2;
			} else {
				return null;
			}
		}
	}

	private LLNode<Integer> processRoots(LLNode<Integer> root1,
			LLNode<Integer> root2) {
		LLNode<Integer> prev = root1;
		LLNode<Integer> cur = root1.getNext();
		while (cur != null) {
			if (cur.getData() < root2.getData()) {
				prev = cur;
				cur = cur.getNext();
			} else {
				prev.setNext(root2);
				LLNode<Integer> temp = root2.getNext();
				root2.setNext(cur);
				prev = root2;
				root2 = temp;
			}
			if (root2 == null) {
				break;
			}
		}
		if (root2 != null) {
			prev.setNext(root2);
		}
		return root1;
	}
	
	public static void main(String[] args) {
		LLNode head1 = new LLNodeImpl(2);
		LLNode node = null;
		LLNode next = new LLNodeImpl<Integer>(6);
		node = head1;
		node.setNext(next);
		node = next;
		next = new LLNodeImpl<Integer>(6);
		node.setNext(next);
		
		LLNode head2 = new LLNodeImpl(2);
		next = new LLNodeImpl<Integer>(6);
		node = head2;
		node.setNext(next);
		node = next;
		next = new LLNodeImpl<Integer>(6);
		node.setNext(next);
		
		
		MergeList _inst = new MergeList();
		LLNode result = _inst.mergeSortedList(head1, head2);
		LinkedList<Integer> ll = new LinkedList<Integer>(result);
//		Util.printIterator(ll.getIterator());
	}

}
