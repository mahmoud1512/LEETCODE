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
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        solve(root);
        return root;
    }
    void solve(TreeNode node)
    {
        if(node==null)
            return;
        solve(node.right);
        sum+=node.val;
        node.val=sum;
        solve(node.left);
    }
   

}