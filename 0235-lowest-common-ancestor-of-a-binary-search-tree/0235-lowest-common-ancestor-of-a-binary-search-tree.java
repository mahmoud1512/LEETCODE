/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode v;
    long mnlen;
    TreeNode x1;
    TreeNode x2;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        v=null;
        mnlen=Long.MAX_VALUE;
        x1=p;
        x2=q;
        solve(root,-1000000000,1000000000);
        return v;
    }

    private void solve(TreeNode root, int minValue, int maxValue) {
       
        boolean check1=x1.val>=minValue&&x1.val<=maxValue;
        boolean check2=x2.val>=minValue&&x2.val<=maxValue;
        if(maxValue-minValue<mnlen&& check1 &&check2)
        {
            v=root;
            mnlen=maxValue-minValue;
        }
        if(root.left!=null)
          solve(root.left, minValue,root.val-1);
        if(root.right!=null)
            solve(root.right, root.val+1, maxValue);
    }

    
}