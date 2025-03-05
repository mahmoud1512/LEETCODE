class Solution {
    public int lengthOfLIS(int[] nums) {
        int len=nums.length;
         int[]Dp=new int[len];
         Dp[0]=1;
         int ans=1;
        for (int i = 1; i < len; i++) {
            int mx=0;
            for (int j = 0; j < i; j++) {
                if(nums[j]<nums[i])
                {
                    mx=Math.max(mx,Dp[j]);
                }
            }
            Dp[i]=mx+1;
            ans=Math.max(ans,Dp[i]);
        }
        
    
        return ans;
    }
}