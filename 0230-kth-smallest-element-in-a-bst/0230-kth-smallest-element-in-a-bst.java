class Solution {
    int target;
    List<Integer>ans;
    public int kthSmallest(TreeNode root, int k) {
        ans=new ArrayList<>();
        findLess(root);
         return ans.get(k-1);
    }

    private void findLess(TreeNode root) {
        if(root==null)
            return;
        findLess(root.left);
        ans.add(root.val);
        findLess(root.right);
    }
}