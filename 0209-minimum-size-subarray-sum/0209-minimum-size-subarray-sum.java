class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int len=nums.length;
        int left=0;   // left is initialized

        int sum=0;   //window state(empty)
        int globalMin=Integer.MAX_VALUE;    // current global min

        // condition is sum < target , when I surpass it  will only be one element, so it will be detected inside while loop
        for (int i = 0; i < len; i++) {

            sum+=nums[i];

            while (sum>=target&&left<=i)
            {
                globalMin=Math.min(globalMin,i-left+1);
                sum-=nums[left];
                left++;
            }
        }

        return globalMin==Integer.MAX_VALUE?0:globalMin;

    }
}