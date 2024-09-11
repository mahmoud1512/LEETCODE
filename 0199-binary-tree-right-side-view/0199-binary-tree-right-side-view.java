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
    public List<Integer> rightSideView(TreeNode root) {
         List<Integer>ans=new ArrayList<>();
        Queue<TreeNode>BFS_Queue=new ArrayDeque<>();
         if(root==null)
             return ans;
         BFS_Queue.add(root);
         int level=1;
         int count;
         while (!BFS_Queue.isEmpty())
         {
             count=0;
             for (int i=0;i<level;i++)
             {
                 TreeNode x=BFS_Queue.poll();
                 if (i==level-1)
                     ans.add(x.val);
                 if(x.left!=null)
                 {
                     count++;
                     BFS_Queue.add(x.left);
                 }
                 if (x.right!=null)
                 {
                     count++;
                     BFS_Queue.add(x.right);
                 }
             }
             level=count;
             
         }
         return ans;
    }
}