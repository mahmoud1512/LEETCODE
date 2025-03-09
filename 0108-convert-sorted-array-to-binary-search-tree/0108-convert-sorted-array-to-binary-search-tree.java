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
    int []arr;
    public TreeNode sortedArrayToBST(int[] nums) {
        
        arr=nums;
          return  solve(0,nums.length-1);
    }
    TreeNode solve(int l, int r)
    {
        if(l>r)
            return null;
        if(l==r)
            return new TreeNode(arr[l]);
        int m=(l+r)/2;
        TreeNode root=new TreeNode(arr[m]);
        
        root.left=solve(l,m-1);
        root.right=solve(m+1,r);
        return root;
        
    }
}