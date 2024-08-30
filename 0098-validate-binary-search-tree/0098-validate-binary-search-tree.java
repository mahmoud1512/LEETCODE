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
    private long[] traverse(TreeNode root)
    {
        if (root==null)
            return new long[]{Long.MAX_VALUE,Long.MIN_VALUE};
        long[] p1=traverse(root.right);
        long[] p2=traverse(root.left);
        if(root.val<=p2[1]||root.val>=p1[0])
            ans=false;
        return new long[]{Math.min(root.val,Math.min(p1[0],p2[0])),Math.max(root.val,Math.max(p1[1],p2[1]))};
    }

}