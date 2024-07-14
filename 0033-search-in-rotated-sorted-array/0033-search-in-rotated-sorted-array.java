class Solution {
      int[]temp;
      int siz;
      int goal;
    public int search(int[] nums, int target) {
         goal=target;
         siz=nums.length;
         temp=nums;
         if(can(siz)==0)
         {
            return Bsearch(0,siz-1);
         }
         int min1=0,min2=0;
            int l=1,r=siz;     
            int ans=-1;
            while (l<=r)
            {
                int m=(l+r)/2;
                int x=can(m);
                if(x==0)
                {
                   min1=nums[0];
                   min2=nums[m];
                   if(min1<=target)
                   {
                       ans=Bsearch(0,m-1);
                   }
                   else
                       ans=Bsearch(m,siz-1);
                   break;
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
    int Bsearch(int st,int end)
    {
        while (st<=end)
        {
            int mid=(st+end)/2;
            if(temp[mid]==goal)
                return mid;
            else if(goal>temp[mid])
            {
                st=mid+1;
            }
            else 
                end=mid-1;
        }
        return -1;
    }
}