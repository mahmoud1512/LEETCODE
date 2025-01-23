class Solution {
    int[]Dp;
    public int maxSubArray(int[] nums) {
        int size=nums.length;
        Dp=new int[size];
        Dp[0]=nums[0];
        for (int i = 1; i < size; i++) {
            Dp[i]=Math.max(nums[i],Dp[i-1]+nums[i]);
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            max=Math.max(max,Dp[i]);
        }
        return max;
    }
}