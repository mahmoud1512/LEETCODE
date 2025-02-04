class Solution {
    public int maxAscendingSum(int[] nums) {
        
        int sum=0;
        int maxSum=0;
        int len=nums.length;
        for (int i = 0; i < len; i++) {
            if(i!=0&&nums[i]>nums[i-1]) {
                sum += nums[i];
            } else if (i==0) {
                sum+=nums[i];
            }
            else
            {
                sum=nums[i];
            }
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}