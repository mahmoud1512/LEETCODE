class Solution {
    public int searchInsert(int[] nums, int target) {
           int l=0,r=nums.length-1; int ans=-1;
           while (l<=r)    //we want to find nearest element to target from left
           {
               int m=(l+r)/2;
               if(nums[m]<=target)
               {
                   ans=m;
                   l=m+1;
               }
               else
               {
                   r=m-1;
               }
           }
           if(ans!=-1&&nums[ans]==target)
               return ans;   
           else  
               return ans+1;
         
    }
}