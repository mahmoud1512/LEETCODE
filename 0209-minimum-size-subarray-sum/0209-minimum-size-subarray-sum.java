class Solution {
      long[]preSum;
     int siz;
    public int minSubArrayLen(int target, int[] nums) {
           siz= nums.length;
          preSum=new long[siz+1];preSum[0]=0;
        for (int i = 1; i < siz+1; i++) {
            preSum[i]=preSum[i-1]+nums[i-1];
        }

        //problem is monotonically increasing in sense of size
        int l=1,r=siz;
        int ans=siz+1;
        while (l<=r)
        {
            int m=(l+r)/2;
            if(can(m,target))
            {
                ans=Math.min(ans,m);
                r=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        if(ans==siz+1)
           return 0;
        return ans;
    }
    boolean can(int x,int target)
    {
       long val;           
        for (int i = 0; i <= siz-x; i++) {
            val=preSum[x+i]-preSum[i];
            if ((int)val>=target)
                return true;
        }
        return false;
    }
}