class Solution {
      
    public int goodNodes(TreeNode root) {
          return solve(root, -100000);
    }

    private int solve(TreeNode root, int max) {
        if(root==null)
            return 0;
        int val=max;
        boolean ok=false;
        if(root.val>=max)
        {
            val=root.val;
            ok=true;
        }
        if (ok)
            return 1+solve(root.left,val)+solve(root.right,val);
        else 
            return solve(root.left,val)+solve(root.right,val);
    }
}