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
    public int sumNumbers(TreeNode root) {
          return solve(root,root.val);
    }

    private int solve(TreeNode root, int val) {
        if(root.left==null&&root.right==null)
            return val;
        int p1=0,p2=0;
        if(root.left!=null)
            p1=solve(root.left,val*10+root.left.val);
        if(root.right!=null)
            p2=solve(root.right,val*10+root.right.val);
        return p1+p2;

    }
}