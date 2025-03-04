class Solution {
   
    int []dp;
    public int climbStairs(int n) {
         dp=new int[n+1];
         Arrays.fill(dp,-1);
         dp[0]=1;
         return solve(n);
    }
    private int solve(int step)
    {
        if(step<0)
            return 0;
        if(dp[step]!=-1)
        {
            return dp[step];
        }
        dp[step]=solve(step-1)+solve(step-2);
        return dp[step];
    }
}