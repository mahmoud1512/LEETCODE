class Solution {
    public boolean isValidBST(TreeNode root) {
          return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    boolean check(TreeNode x,long mn,long mx)
    {
        if(x==null)
            return true;
        boolean p1=x.val>mn;
        boolean p2=x.val<mx;
        return p1&&p2&&check(x.left,mn,x.val)&&check(x.right,x.val,mx);
    }
}