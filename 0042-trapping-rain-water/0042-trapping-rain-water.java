class Solution {
    public int trap(int[] height) {
             int siz=height.length;
             int[]leftMax=new int[siz];
             int[]rightMax=new int[siz];
             int j=0;
             int mx=0;
             while(j!=siz)
             {
                 if(height[j]>mx)
                     mx=height[j];
                 leftMax[j]=mx;
                 j++;
             }
             j=siz-1;
             mx=0;
            while(j!=-1)
            {
                if(height[j]>mx)
                    mx=height[j];
                rightMax[j]=mx;
                j--;
            }
            int ans=0;
        for (int i = 0; i < siz; i++) {
            ans+=Math.max(Math.min(leftMax[i],rightMax[i])-height[i],0);
        }
        return ans;
    }
}