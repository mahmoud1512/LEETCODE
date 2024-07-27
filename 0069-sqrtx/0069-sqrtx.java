class Solution {
    public int mySqrt(int x) {
        int l=0,r=Integer.MAX_VALUE;
        int ans=-1;
        while (l<=r)
        {
            int m=l+(r-l)/2;
            if((long)m*m==x) {
                return m;
            }
            else if ((long)m*m<x) {
                ans=m;
                l=m+1;
            }
            else
            {
                r=m-1;
            }
        }
        return ans;
    }
}