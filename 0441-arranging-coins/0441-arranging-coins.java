class Solution {
    public int arrangeCoins(int n) {
        int l=1,r=n,ans=0;
        while (l<=r)
        {
            int m=(int)(((long)l+r)/2);
            if((long)m*(m+1)/2<=n)
            {
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