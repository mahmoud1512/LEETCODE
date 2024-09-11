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
    int target;
    int ans;
    int x;
    public int kthSmallest(TreeNode root, int k) {
        x=k;
        findLess(root);
         return ans;
    }

    private void findLess(TreeNode root) {
        if(root==null)
            return;
        findLess(root.left);
        target++;
        if(target==x){
          ans=root.val;
          return;
        }
        findLess(root.right);
    }
}