class Solution {
    boolean ans=true;
    public boolean isBalanced(TreeNode root) {
        solve(root);
        return ans;
    }

    private void solve(TreeNode root) {
           if(root==null)
               return ;
          int p1=getLen(root.left);
          int p2=getLen(root.right);
          ans&=Math.abs(p1-p2)<=1;
          solve(root.left);
          solve(root.right);
    }
    private int getLen(TreeNode x)
    {
        if (x==null)
            return 0;
        int p1=1+getLen(x.left);
        int p2=1+getLen(x.right);
        return Math.max(p1,p2);
    }


}