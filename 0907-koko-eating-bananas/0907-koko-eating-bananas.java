class Solution {
    int []PilesClone;int hours;
    public int minEatingSpeed(int[] piles, int h) {
        PilesClone=piles;
        hours=h;
        int start=1,end=1000000000;int ans=1000000000;
        while (start<=end)
        {
            int mid=(start+end)/2;
            if(can(mid))
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }

        }
        return ans;
    }
    boolean can(int k)
    {
        long t=0;
        for (int x:PilesClone) {
            int y=x;
            t+=(long)y/k;
            int tr=y%k;
            if(tr>0)
            t++;
        }
        return t<=hours;
    }
}