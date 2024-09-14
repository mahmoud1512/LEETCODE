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
    Stack<TreeNode>stack;
    public TreeNode convertBST(TreeNode root) {
        stack=new Stack<>();
        solve(root);
        modify();
        return root;
    }
    void solve(TreeNode node)
    {
        if(node==null)return;
        solve(node.left);
        stack.push(node);
        solve(node.right);
    }
    void modify()
    {
        long ans=0;
        while (!stack.isEmpty())
        {
            TreeNode x=stack.pop();
            ans+=x.val;
            x.val= (int) ans;
        }
    }
    
}