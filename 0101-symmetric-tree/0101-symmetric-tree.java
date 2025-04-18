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
    public boolean isSymmetric(TreeNode root) {
       return root==null||mirror(root.left,root.right);
    }

    private boolean mirror(TreeNode n1, TreeNode n2) {
        if(n1==null&&n2==null)
            return true;
        else if(n1!=null&&n2!=null)
            return n1.val==n2.val&&mirror(n1.left,n2.right)&&mirror(n1.right,n2.left);
        else 
            return false;
    }
}