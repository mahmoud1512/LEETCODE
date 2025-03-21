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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        Queue<TreeNode> queue=new ArrayDeque<>();
        boolean left=true;
        if(root==null)
        {
            return ans;
        }
        queue.add(root);
        int siz=1,depth;
        while (!queue.isEmpty())
        {
            depth=0;
            List<Integer>list=new ArrayList<>();
            for (int i = 0; i < siz; i++) {
                TreeNode x=queue.poll();
                list.add(x.val);
                if(x.left!=null)
                {
                    queue.add(x.left);
                    depth++;
                }
                if(x.right!=null)
                {
                    queue.add(x.right);
                    depth++;
                }
            }
            if (left)
              ans.add(list);
            else
            {
                Collections.reverse(list);
                ans.add(list);
            }
            left=!left;
            siz=depth;
        }
        return ans;
    }
}