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
    boolean ans=false;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
             solve(root,subRoot);
             return ans;
    }

    private void solve(TreeNode root, TreeNode subRoot) {
        if (root==null)
            return;
        if(ans==true)
            return;
        if(root.val==subRoot.val)
        {
            ans=ans||Check(root,subRoot);
        }
        solve(root.left,subRoot);
        solve(root.right,subRoot);
    }

    private boolean Check(TreeNode root, TreeNode subRoot) {
           if(root==null&&subRoot!=null)
               return false;
           if(root!=null&&subRoot==null)
               return false;
           if(root==null&&subRoot==null)
               return true;
           return root.val==subRoot.val&&Check(root.left,subRoot.left)&&Check(root.right,subRoot.right);
    }
}