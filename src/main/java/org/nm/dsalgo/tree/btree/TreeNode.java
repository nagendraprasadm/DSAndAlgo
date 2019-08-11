package org.nm.dsalgo.tree.btree;

public class TreeNode {
	
	private TreeNode _left;
	private TreeNode _right;
	private int _data;
	
	public TreeNode(int data){
		this._data = data;
	}
	
	public TreeNode getLeft() {
		return _left;
	}
	public void setLeft(TreeNode left) {
		_left = left;
	}
	public TreeNode getRight() {
		return _right;
	}
	public void setRight(TreeNode right) {
		_right = right;
	}
	public int getData() {
		return _data;
	}
	public void setData(int data) {
		_data = data;
	}

}
