class Solution {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        
      return helper(root1,root2);
    }

    private TreeNode helper(TreeNode root1, TreeNode root2) {
          TreeNode x = null;
          if (root1!=null&&root2!=null) {
              x = new TreeNode(root1.val + root2.val);
              x.left = helper(root1.left, root2.left);
              x.right=helper(root1.right,root2.right);
          }
          else if (root1!=null) {
              x=new TreeNode(root1.val);
              x.left = helper(root1.left, null);
              x.right=helper(root1.right,null);
              
          } else if (root2!=null) {
              x=new TreeNode(root2.val);
              x.left = helper(null, root2.left);
              x.right=helper(null,root2.right);
          }
          
          return x;
         
    }
}