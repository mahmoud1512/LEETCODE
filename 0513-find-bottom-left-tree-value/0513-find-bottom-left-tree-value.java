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
    public int findBottomLeftValue(TreeNode root) {
         Queue<TreeNode>BFS=new ArrayDeque<>();
         BFS.add(root);
         int len=1;
         int count;
    //First one from the last level
    TreeNode target=null;    
         while (!BFS.isEmpty())
         {
             count=0;
             for (int i=0;i<len;i++)
             {
                 TreeNode poped=BFS.poll();
                 if(i==0)
                     target=poped;
                 if(poped.left!=null)
                 {
                     BFS.add(poped.left);
                     count++;
                 }
                 if(poped.right!=null)
                 {
                     BFS.add(poped.right);
                     count++;
                 }
                 
             }
             len=count;
         }
         return target.val;
    }
}