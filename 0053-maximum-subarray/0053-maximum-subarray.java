class Solution {
    public int maxSubArray(int[] nums) {
         int currentSum=nums[0];
         int maxSum=nums[0];
         int len=nums.length;
        for (int i = 1; i < len; i++) {
            currentSum=Math.max(nums[i],currentSum+nums[i]);   // start fresh or accumulate
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
}