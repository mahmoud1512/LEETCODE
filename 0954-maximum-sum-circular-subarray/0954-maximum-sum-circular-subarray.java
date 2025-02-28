class Solution {
    public int maxSubarraySumCircular(int[] nums) {
         
        int len=nums.length;
        int globalMax=nums[0],globalMin=nums[0];       // we are not allowed to take an empty sub-array so initialize arbitrarily to
                                                       // To the first element
        int currentMax=nums[0],currentMin=nums[0];
        int totalSum=nums[0];

        for (int i = 1; i <len ; i++) {
            
            currentMax=Math.max(currentMax+nums[i],nums[i]);   // fresh or continue
            currentMin=Math.min(currentMin+nums[i],nums[i]);
            globalMax=Math.max(globalMax,currentMax);
            globalMin=Math.min(globalMin,currentMin);
            totalSum+=nums[i];
        }
        if (globalMax<0)   // all elements were negative
        {
            return globalMax;
        }
        else
        {
            return Math.max(globalMax,totalSum-globalMin);
        }
        
    }
}