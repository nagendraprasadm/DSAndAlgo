package org.nm.dsalgo.stack.test;

import org.nm.dsalgo.stack.Stack;
import org.nm.dsalgo.stack.StackImpl;
import org.nm.dsalgo.stack.StackLLImpl;

public class StackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		Stack<Integer> stack = new StackImpl<Integer>(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
		stack.push(5);
		int size = stack.getSize();
		for (int i = 0; i < size; i++) {
			System.out.println(stack.pop());
		}

		stack = new StackLLImpl(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
		stack.push(5);
		size = stack.getSize();
		for (int i = 0; i < size; i++) {
			System.out.println(stack.pop());
		}
	
	
	}

}
 