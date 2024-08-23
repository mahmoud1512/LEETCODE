class Solution {
    int max=Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        int x=dfs(root);
        return max;

    }
    private int dfs(TreeNode node)
    {
        if(node==null)
            return 0;
        int p1=dfs(node.right);
        int p2=dfs(node.left);
        max=Math.max(max,p1+p2);
        return 1+Math.max(p1,p2);
    }
}