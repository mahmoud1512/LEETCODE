class Solution {
    public int[] searchRange(int[] nums, int target) {
           int[]ans={-1,-1};
           int l=0,r= nums.length-1;
           while(l<=r)
           {
               int mid=(l+r)/2;
               if(nums[mid]==target)
               {
                   ans[0]=mid;
                   r=mid-1;    //try to capture first occurrence

               }
               else if (nums[mid]<target) {
                  l=mid+1;
               }
               else
               {
                   r=mid-1;
               }
           }
           if(ans[0]==-1)
               return ans;
           else
           {
               l=ans[0];r= nums.length-1;
               while(l<=r)
               {
                   int mid=(l+r)/2;
                   if(nums[mid]==target)
                   {
                       ans[1]=mid;
                       l=mid+1;    //try to capture last occurrence

                   }
                   else if (nums[mid]<target) {
                       l=mid+1;
                   }
                   else
                   {
                       r=mid-1;
                   }
               }
               
           }
           return ans;
    }
}