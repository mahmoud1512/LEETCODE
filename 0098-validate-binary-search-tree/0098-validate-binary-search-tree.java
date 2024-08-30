/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean ans=true;
    public boolean isValidBST(TreeNode root) {
       
         traverse(root);
         return ans;
    }
    private void traverse(TreeNode root)
    {
        if (root==null)
            return;
        long right=getMin(root.right);
        long left=getMax(root.left);
        if(root.val<=left||root.val>=right)
        {
            ans=false;
            return;
        }
        traverse(root.left);
        traverse(root.right);
    }
    long getMin(TreeNode x)
    {
        if(x==null)
            return Long.MAX_VALUE;
        return Math.min((long)x.val,Math.min(getMin(x.left),getMin(x.right)));
    }
    long getMax(TreeNode x)
    {
        if(x==null)
            return Long.MIN_VALUE;
        return Math.max((long)x.val,Math.max(getMax(x.left),getMax(x.right)));
    }
}