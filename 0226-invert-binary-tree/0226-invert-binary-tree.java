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
      TreeNode ans;
    public TreeNode invertTree(TreeNode root) {
           ans=root;
           helper(root);
           return ans;
    }
    void helper(TreeNode x)
    {
        if(x==null)
            return;
        TreeNode h=x.left;
        x.left=x.right;
        x.right=h;
        helper(x.left);
        helper(x.right);
    }
}