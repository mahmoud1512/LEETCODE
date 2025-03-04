class Solution {
    public int coinChange(int[] coins, int amount) {

        int[]DP=new int[amount+1];
        Arrays.fill(DP,-1);
        DP[0]=0;

        if(amount==0)
            return 0;
        for (int i = 1; i <= amount; i++) {

            int curr=-1;
            for (int c:coins) {
                if(c>i)
                {
                    continue;
                }
                if(DP[i-c]!=-1)
                {
                    if(curr==-1)
                    {
                        curr=DP[i-c]+1;
                    }
                    else{
                        curr=Math.min(curr,DP[i-c]+1);
                    }
                    
                    
                }

            }
            DP[i]=curr;
        }
       return DP[amount];
    }
}