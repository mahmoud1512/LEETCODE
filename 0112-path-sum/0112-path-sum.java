class Solution {
    int val=0;
    int target;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
           return false;
        target=targetSum;
            return solve(root);
        
    }
    boolean solve(TreeNode x)
    {
            
        if(x.left==null&&x.right==null)
        {
            return val+x.val==target;
        }
        
        val+= x.val;
        boolean p1=false;
        boolean p2=false;
        if(x.left!=null)
        {
            p1=solve(x.left);
        }
        if (x.right!=null)
        {
            p2=solve(x.right);
        }
        val-=x.val;
        
        return p1||p2;
        

    }
}