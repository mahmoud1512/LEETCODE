class Solution {
    int[]temp;
    public int[] sortedSquares(int[] nums) {
        temp=nums;
       int r,l;
            r=findLastPositive();
            l=r-1;
            int siz=nums.length;
            int []ans=new int[siz];
            int k=0;

            while (l>=0&&r<=siz-1)
            {
                if(Math.abs(nums[l])<=Math.abs(nums[r]))
                {
                    ans[k++]=nums[l]*nums[l];
                    l--;
                }
                else
                {
                    ans[k++]=nums[r]*nums[r];
                    r++;
                }
            }
            while(l>=0)
            {
                ans[k++]=nums[l]*nums[l];
                l--;
            }
            while (r<=siz-1)
            {
                ans[k++]=nums[r]*nums[r];
                r++;
            }
            return ans;
        
    }

    int findLastPositive()
    {
        int l=0,r=temp.length-1;
        int ans=r+1;
        while (l<=r)
        {
            int m=l+(r-l)/2;
            if(temp[m]>=0)
            {
                ans=m;
                r=m-1;
            }
            else
                l=m+1;
        }
        return ans;
    }
}