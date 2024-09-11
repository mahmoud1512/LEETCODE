class Solution {
    int[]values;
    int len;
    public TreeNode sortedArrayToBST(int[] nums) {
         len=nums.length;
         values=nums;

        return solve(0,len-1);


    }

   private TreeNode solve(int start, int end) {
            int mid=(start+end)/2;
            TreeNode x=null;
                x=new TreeNode(values[mid]);
            if(x!=null) {
                if(mid>start)
                    x.left = solve(start, mid - 1);
                if(mid<end)
                    x.right = solve(mid + 1, end);
            }
            return x;
        }
}