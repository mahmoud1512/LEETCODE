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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return checkSimilar(p,q);
    }
    private boolean checkSimilar(TreeNode p,TreeNode q)
    {
        if(p==null&&q!=null)
          {
            return false;
          }
        if(p!=null&&q==null)
        {
            return false;
        }  
        if(p==null&&q==null)
        {
            return true;
        }
           
        return p.val==q.val&&checkSimilar(p.left,q.left)&&checkSimilar(p.right,q.right);
    }
}