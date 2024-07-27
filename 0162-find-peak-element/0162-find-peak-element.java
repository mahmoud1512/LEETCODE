class Solution {
      int[]temp;
      int siz;
    public int findPeakElement(int[] nums) {
        siz=nums.length;
        if(siz==1)
           return 0;
           int l=0,r=siz-1;
           temp=nums;
           while(l<=r)
           {
               int m=l+(r-l)/2;
               int ans=can(m);
               if(ans==0)
               {
                   return m;
               }
               else if(ans==1)
               {
                   l=m+1;
               }
               else 
                   r=m-1;
           }
           return 0;
    }
    int can(int m)
    {
        if(m==0)
        {
            if(temp[0]>temp[1])
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }
        else if (m==siz-1) {
            if(temp[m]>temp[m-1])
            {
                return 0;
            } 
            else  {
                return -1;
            }
        }
        else
        {
            if(temp[m]>temp[m+1]&&temp[m]>temp[m-1])
                return 0;
            else if(temp[m+1]>temp[m])
                return 1;
            else 
                return -1;
        }
    }
}