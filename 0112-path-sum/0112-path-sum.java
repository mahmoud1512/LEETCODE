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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
         return false;
         return solve(root,targetSum,root.val);
    }

    private boolean solve(TreeNode root, int targetSum,long currSum) {
        if(root.left==null&&root.right==null)
        {
            return currSum==targetSum;
        }
        boolean p1=false,p2=false;
        if(root.left!=null)
        {
            p1=solve(root.left,targetSum,currSum+root.left.val);
        }
        if (root.right!=null)
        {
            p2=solve(root.right,targetSum,currSum+root.right.val);
        }
        return p1||p2;
    }
}