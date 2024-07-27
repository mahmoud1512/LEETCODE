class Solution {
    public int singleNonDuplicate(int[] nums) {
        //how to manipulate left and right pointers
        int siz=nums.length;
        if(siz==1) return nums[0];
        else if (nums[siz-1]!=nums[siz-2]) {
            return nums[siz-1];
        }
        else if(nums[0]!=nums[1])
        {
            return nums[0];
        }
        else
        {
            int l=0,r=siz-3;
            while (l<=r)
            {
                int m=l+(r-l)/2;
                if(m%2==1)
                   m=m-1;
                if(nums[m]!=nums[m+1]&&nums[m]!=nums[m-1])
                    return nums[m];
                else if (nums[m]==nums[m+1]) {
                    l=m+2;
                }
                else
                    r=m-2;
            }
        }
        return nums[0];
    }
}