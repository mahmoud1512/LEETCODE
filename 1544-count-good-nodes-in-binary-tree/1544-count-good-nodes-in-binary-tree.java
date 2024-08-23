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
    int max=Integer.MIN_VALUE;
    int val=0;
    public int goodNodes(TreeNode root) {
          dfs(root,max);
          return val;
    }

    private void dfs(TreeNode root, int max) {
        if (root==null)
            return;
        if(root.val>=max)
        {
            val++;
            dfs(root.left, root.val);
            dfs(root.right,root.val);
        }
        else
        {
            dfs(root.left, max);
            dfs(root.right,max);
        }
    }
}