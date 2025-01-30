class Solution {
    public int firstMissingPositive(int[] nums) {

        int min=getMin(nums);
        if(min>=1)
        {
            return solve(nums,0);
        }
        else
        {
            int increase=1-min;
            int n=nums.length;
            for (int i = 0; i < n; i++) {
                nums[i] += increase;
            }
            return solve(nums,increase);
        }
    }

    private int getMin(int[] nums) {
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            if(nums[i]>n)
                nums[i]=n+1;
            else if(nums[i]<0)
                nums[i]=-(n+1);
        }
        
        int min=Integer.MAX_VALUE;
        for (int num:nums) {
            min=Math.min(min,num);
        }
        return min;
    }

    private int solve(int[] nums, int increase) {
        int n=nums.length;
        for (int num:nums) {
            int x=Math.abs(num);
            if(x>increase &&x-increase<=n)
            {
                if(nums[x-1-increase]>0)
                    nums[x-1-increase]=- nums[x-1-increase];
            }

        }

        for (int i = 0; i < n; i++) {
            if(nums[i]>0)
                return i+1;
        }
        return n+1;
    }
}