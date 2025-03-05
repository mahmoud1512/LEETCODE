class Solution {
    int[]Dp;
    int len;
    int[] vals;
    public int rob(int[] nums) {
        len=nums.length;
        vals=nums;
         Dp=new int[len];
        Arrays.fill(Dp,-1);
        int v1=solve(0);
        int v2=solve(1);
         return Math.max(v1,v2);
    }

    int solve(int idx)
    {
        if(idx==len)
            return 0;
        if(Dp[idx]!=-1)
            return Dp[idx];
        int mx=vals[idx];
        for (int i = idx+2; i <len ; i++) {
            mx=Math.max(mx,vals[idx]+solve(i));
        }
        Dp[idx]=mx;
        return Dp[idx];
    }


}