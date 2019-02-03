package org.nm.dsalgo.problems.tree.btree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.nm.dsalgo.tree.btree.TreeNode;

public class TreeTraversal {
	
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
		levelOrderBottom(root,1,finalList);
		return finalList;
    }
	
	private void levelOrderBottom(TreeNode root, int level, List<List<Integer>> finalList){
		if(root != null){
			List<Integer> list = null;
			if(finalList.size() < level){
				list = new ArrayList<Integer>();
				finalList.add(level - 1, list);
			}
			list = finalList.get(level - 1);
			list.add(root.getData());
			levelOrderBottom(root.getLeft(), level + 1, finalList);
			levelOrderBottom(root.getRight(), level + 1, finalList);
		}
	}
	
	public static void main(String[] args) {
		TreeTraversal _inst = new TreeTraversal();
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(-2);
		TreeNode right = new TreeNode(-3);
		root.setLeft(left);
		root.setRight(right);
		TreeNode node = left;
		left = new TreeNode(1);
		right = new TreeNode(3);
		node.setLeft(left);
		node.setRight(right);
		
		
		node = right;
		left = new TreeNode(15);
		//right = new TreeNode(7);		
		//node.setLeft(left);
		//node.setRight(right);
		//List finalList = _inst.levelOrder(root);
		//Collections.reverse(finalList);
		//Util.printIterator(finalList.iterator());
		System.out.println(_inst.hasPathSum(root, -5));
	}
	
	
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();   
        levelOrder(root,0,resultList);
        return resultList;
   }
   
   public void levelOrder(TreeNode root,int level, List<List<Integer>> resultList){
       if(root != null){
           List<Integer> list = null;
           if(resultList.size() >= level +1){
               list = resultList.get(level);
           }else{
               list = new ArrayList<Integer>();
               resultList.add(level, list);
           }
           list.add(root.getData());
           levelOrder(root.getLeft(),level + 1, resultList);
           levelOrder(root.getRight(),level + 1, resultList);
       }
   
   }
   
   
   public boolean hasPathSum(TreeNode root, int sum) {
		return hasPathSum(root, sum, 0);
   }
   public boolean hasPathSum(TreeNode root, int sum, int sumInt) {
			if(root != null){
			boolean sumExists = false;
			sumInt += root.getData();
			if(sumInt == sum && root.getLeft() == null && root.getRight() == null ){
				return true;
			}else if (sumInt != sum) {
				sumExists = hasPathSum(root.getLeft(), sum, sumInt) || hasPathSum(root.getRight(), sum, sumInt);
			}
			return sumExists;
		}
       return false;
   }


}
