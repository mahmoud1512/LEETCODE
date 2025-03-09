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
    public List<Double> averageOfLevels(TreeNode root) {

        int q;
        int l=1;
        List<Double>ans=new ArrayList<>();
        
        ArrayDeque<TreeNode>nodes=new ArrayDeque<>();
        nodes.add(root);
        while (!nodes.isEmpty())
        {
            double sum=0;
            q=0;
            for (int i = 0; i < l; i++) {
                TreeNode x=nodes.pop();
                sum+=x.val;
                if(x.left!=null)
                {
                    nodes.add(x.left);
                    q++;
                }
                if (x.right!=null)
                {
                    nodes.add(x.right);
                    q++;
                }
            }
            
            ans.add(sum/l);
            l=q;
        }
        return ans;
    }
}