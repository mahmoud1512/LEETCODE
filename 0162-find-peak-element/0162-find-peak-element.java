class Solution {

    public int findPeakElement(int[] nums) {

        int len=nums.length;
        int l=0,r=len-1;
        int m = 0;
        while (l<=r)
        {
            m=(l+r)/2;
            int res=can(m,len,nums);
            if(res==0)
            {
                return m;
            }
            else if(res==1)
            {
                l=m+1;
            }
            else
            {
                r=m-1;
            }
        }
        return m;
    }

    private int can(int m, int len,int[]nums) {

        if(m==0&&len!=1)
        {
            return nums[m+1]<nums[m]?0:1;
        } else if (m==0) {
            return m;
        } else if (m==len-1&&len>1) {
            return nums[m-1]<nums[m]?0:-1;
        } else if (m==len-1) {
            return 0;
        }
        else
        {
            if(nums[m+1]>nums[m])
                return 1;
            else if (nums[m-1]>nums[m]) {
                return -1;
            }
            else 
                return 0;
        }
    }
}