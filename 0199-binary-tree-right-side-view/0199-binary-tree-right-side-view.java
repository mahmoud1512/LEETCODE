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
        int q=0;
        int l=1;
        List<Integer>ans=new ArrayList<>();
        if(root==null)
           return ans;
        ArrayDeque<TreeNode>nodes=new ArrayDeque<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            q=0;
            for (int i = 0; i < l; i++) {

                TreeNode x = nodes.pop();
                if (i == l - 1) {
                    ans.add(x.val);
                }
                if (x.left != null) {
                    nodes.add(x.left);
                    q++;
                }
                if (x.right != null) {
                    nodes.add(x.right);
                    q++;
                }
                
            }
            l=q;
        }
        return ans;
    }
}