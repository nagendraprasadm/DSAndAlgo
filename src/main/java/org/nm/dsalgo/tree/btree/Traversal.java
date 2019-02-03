package org.nm.dsalgo.tree.btree;

import org.nm.dsalgo.exceptions.OverFlowException;
import org.nm.dsalgo.exceptions.UnderFlowException;

public interface Traversal {
	
	public void preOrder(TreeNode root) throws OverFlowException, UnderFlowException;
	
	public void postOrder(TreeNode root) throws OverFlowException, UnderFlowException;
	
	public void inOrder(TreeNode root) throws OverFlowException, UnderFlowException;
	
	public void processNode(TreeNode root);

}
