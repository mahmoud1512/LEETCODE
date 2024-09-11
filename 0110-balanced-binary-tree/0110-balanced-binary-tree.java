class Solution {
    public boolean isBalanced(TreeNode root) {
        return solve(root)!=-1;
    }

    private int solve(TreeNode root) {
        if(root==null)
            return 0;
        int p1=solve(root.left);
        if(p1==-1)
            return -1;
        int p2=solve(root.right);
        if (p2==-1)
            return -1;

        if(Math.abs(p1-p2)>1)
            return -1;
        return 1+Math.max(p1,p2);
    }
}