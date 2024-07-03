class Solution {
    public int minDifference(int[] nums) {
               int siz= nums.length;
               if(siz<=3)
                   return 0;
               else
               {
                   Arrays.sort(nums);
                   int []ans={nums[siz-4]-nums[0],nums[siz-1]-nums[3],nums[siz-2]-nums[2],nums[siz-3]-nums[1]};
                   Arrays.sort(ans);
                   return ans[0];

               }
    }
}