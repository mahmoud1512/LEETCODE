class Solution {
    public int maxArea(int[] height) {
         int l=0,r=height.length-1,mx=0;
         while(l<r)
         {
             int min=0;boolean ord=true;
             if(height[l]<=height[r])
             {
                 min=height[l];
             }
             else
             {
                 min=height[r];
                 ord=false;
             }
             mx=Math.max(min*(r-l),mx);
             //How to update pointers
             if(ord)
             {
                 l++;
             }
             else
             {
                 r--;
             }
             
         }
         return mx;
    }
}