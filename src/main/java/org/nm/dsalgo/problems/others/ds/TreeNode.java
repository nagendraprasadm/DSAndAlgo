package org.nm.dsalgo.problems.others.ds;

import org.nm.dsalgo.problems.others.easy.RangeSumBST938;

public class TreeNode
{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode ()
    {
    }

    public TreeNode (int val)
    {
        this.val = val;
    }

    public TreeNode (int val, TreeNode left, TreeNode right)
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
