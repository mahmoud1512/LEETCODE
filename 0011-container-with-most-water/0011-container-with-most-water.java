class Solution {
    public int maxArea(int[] height) {
           
        int left=0,right=height.length-1;
        int currentArea;
        int maxArea=Integer.MIN_VALUE;
        while (left<right)
        {
            currentArea=Math.min(height[left],height[right])*(right-left);
            maxArea=Math.max(maxArea,currentArea);
            if(height[left]<=height[right])
                left++;
            else 
                right--;
        }
        return maxArea;
    }
}