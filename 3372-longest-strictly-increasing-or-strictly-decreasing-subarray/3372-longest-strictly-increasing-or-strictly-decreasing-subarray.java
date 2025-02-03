class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int len=nums.length;
        int[]monoIncreasing=new int[len];
        int[]monoDecreasing=new int[len];
        int max=1;
//       
        Arrays.fill(monoIncreasing,1);
        Arrays.fill(monoDecreasing,1);

        for (int i = len-2; i >=0 ; i--) {

            if(nums[i]<nums[i+1]) {
                monoIncreasing[i] = 1 + monoIncreasing[i + 1];
                max=Math.max(monoIncreasing[i],max);
            } else if (nums[i]>nums[i+1]) {
                monoDecreasing[i] = 1 + monoDecreasing[i + 1];
                max=Math.max(monoDecreasing[i],max);
            }
        }

        return max;

    }
}