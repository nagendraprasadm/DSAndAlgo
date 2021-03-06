package org.nm.dsalgo.problems.others.easy;

import org.nm.dsalgo.problems.others.ds.TreeNode;

/**
<pre>
 
  Given the root node of a binary search tree,return the sum of values of all nodes with value between L and R(inclusive).

      The binary search tree is guaranteed to have unique values.

      Example 1:

      Input:root=[10,5,15,3,7,null,18],L=7,R=15
      Output:32

      Example 2:

      Input:root=[10,5,15,3,7,13,18,1,null,6],L=6,R=10
      Output:23

      Note:

      The number of nodes in the tree is at most 10000.
      The final answer is guaranteed to be less than 2^31.
</pre>
    **/

public class RangeSumBST938
{
    public int rangeSumBST (TreeNode root, int L, int R)
    {
        if (root != null) {
            int sum = 0;
            sum = isInRange(root.val, L, R) ? sum + root.val : sum;
            if (root.val > L) {
                sum += rangeSumBST(root.right, L, R);
            }
            if (root.val < R) {
                sum += rangeSumBST(root.right, L, R);
            }
            return sum;
        }
        return 0;
    }

    public int rangeSumBSTbetter (TreeNode root, int L, int R)
    {
        if (root != null) {
            if (root.val > L) {
                return rangeSumBST(root.right, L, R);
            }
            if (root.val < R) {
                return rangeSumBST(root.left, L, R);
            }
            return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(
                root.right,
                L,
                R);
        }
        return 0;
    }

    private boolean isInRange (int n, int L, int R)
    {
        return n >= L && n <= R;
    }

}
