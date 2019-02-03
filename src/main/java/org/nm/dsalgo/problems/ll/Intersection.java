package org.nm.dsalgo.problems.ll;

import org.nm.dsalgo.ll.LLNode;
import org.nm.dsalgo.ll.LLNodeImpl;
import org.nm.dsalgo.ll.LinkedList;

public class Intersection {

	public LLNode getIntersectionNode(LLNode headA, LLNode headB) {
		if (headA != null && headB != null) {
			int lenA = 0;
			int lenB = 0;
			LLNode node = headA;
			while (node != null) {
				node = node.getNext();
				lenA++;
			}
			node = headB;
			while (node != null) {
				node = node.getNext();
				lenB++;
			}
			if (lenA > lenB) {
				int diff = lenA - lenB;
				for (int i = 0; i < diff; i++) {
					headA = headA.getNext();
				}
			} else if (lenB > lenA) {
				int diff = lenB - lenA;
				for (int i = 0; i < diff; i++) {
					headB = headB.getNext();
				}
			}

			while (headA != null && headB != null) {
				if (headA == headB) {
					return headA;
				} else {
					headA = headA.getNext();
					headB = headB.getNext();
				}
			}
			
				return null;
		}
		return null;
	}

	public static void main(String[] args) {
		LinkedList<Integer> ll1 = new LinkedList<Integer>(1);
		LinkedList<Integer> ll2 = new LinkedList<Integer>(2);
		LinkedList<Integer> ll3 = new LinkedList<Integer>(3);
		//ll3.add(6);
		//ll3.add(7);
		ll1.add(2);
		ll1.add(3);
		ll1.add(4);
		ll1.add(ll3.getHead());
		//ll2.add(4);
		ll2.add(ll3.getHead());
		Intersection _inst = new Intersection();
		LLNode<Integer> data = _inst.getIntersectionNode(ll3.getHead(), ll2.getHead());
		System.out.println(data == null ? "NULL" : data.getData());
	}
}
