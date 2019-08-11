package org.nm.dsalgo.tree.btree;

import org.nm.dsalgo.exceptions.OverFlowException;
import org.nm.dsalgo.exceptions.UnderFlowException;
import org.nm.dsalgo.stack.Stack;
import org.nm.dsalgo.stack.StackImpl;

public class IterativeTraversal implements Traversal {

	@Override
	public void preOrder(TreeNode root) throws OverFlowException,
			UnderFlowException {
		// TODO Auto-generated method stub

	}

	@Override
	public void postOrder(TreeNode root) throws OverFlowException,
			UnderFlowException {
		if (root != null) {
			Stack<TreeNode> stack = new StackImpl<TreeNode>(100);
			stack.push(root);
			while (!stack.isEmpty()) {
				TreeNode top = stack.top();
				if (top.getLeft() != null) {
					stack.push(top.getLeft());
				} else if (top.getRight() != null) {
					stack.push(top.getRight());
				} else {
					TreeNode pop = stack.pop();
					processNode(pop);
					if (!stack.isEmpty()) {
						top = stack.top();
						if (pop == top.getLeft()) {
							if (top.getRight() != null) {
								stack.push(top.getRight());
							}
						} else if (pop == top.getRight()) {
							pop = stack.pop();
							processNode(pop);
							if (!stack.isEmpty()) {
								top = stack.top();
								if (pop == top.getLeft()) {
									if (top.getRight() != null) {
										stack.push(top.getRight());
									}
								}
							}
						}

					}
				}

			}
		}

	}

	@Override
	public void inOrder(TreeNode root) throws OverFlowException,
			UnderFlowException {
		// TODO Auto-generated method stub

	}

	@Override
	public void processNode(TreeNode root) {

		System.out.println(root == null ? "NULL" : root.getData());

	}

}
