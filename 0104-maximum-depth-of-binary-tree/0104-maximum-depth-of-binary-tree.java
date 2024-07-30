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
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
           int levels=1;
           Queue<TreeNode>q=new ArrayDeque<>();
           q.add(root);
           Queue<TreeNode>sQ=new ArrayDeque<>();
           while (!q.isEmpty()) {
               sQ=new ArrayDeque<>();
               while (!q.isEmpty()) {
                   TreeNode x = q.poll();
                   if (x.left != null)
                       sQ.add(x.left);
                   if (x.right != null)
                       sQ.add(x.right);

               }
               levels++;
               q = sQ;
           }
           return levels-1;

    }
}