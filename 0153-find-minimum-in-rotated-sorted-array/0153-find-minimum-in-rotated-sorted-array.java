class Solution {
      int[]temp;
      int siz;
    public int findMin(int[] nums) {
         siz=nums.length;
            int l=1,r=siz;
            temp=nums;
            int ans=50000;
            while (l<=r)
            {
                int m=(l+r)/2;
                int x=can(m);
                if(x==0)
                {
                    ans=Math.min(nums[m%siz],ans);
                    l=m+1;
                }
                else if(x==1)
                {
                    l=m+1;
                }
                else
                {
                    r=m-1;
                }
            }
            return ans;
    }
    int can(int x)
    {
        if(temp[0]<=temp[x-1]&&temp[x%siz]<=temp[siz-1])
            return 0;
        else if (temp[0]<=temp[x-1]) {
            return 1;
        }
        else 
            return -1;
    }
}