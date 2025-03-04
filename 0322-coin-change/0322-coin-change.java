class infoHolder
{
    boolean found;
    int count;

    public infoHolder(boolean found, int count) {
        this.found = found;
        this.count = count;
    }
}
class Solution {
    public int coinChange(int[] coins, int amount) {

        infoHolder[]DP=new infoHolder[amount+1];
        DP[0]=new infoHolder(true,0);

        if(amount==0)
            return 0;
        for (int i = 1; i <= amount; i++) {

            infoHolder curr=new infoHolder(false,Integer.MAX_VALUE);
            for (int c:coins) {
                if(c>i)
                {
                    continue;
                }
                if(DP[i-c].found)
                {
                    curr.found=true;
                    curr.count=Math.min(curr.count,DP[i-c].count+1);
                }

            }
            DP[i]=curr;
        }
        if(DP[amount].found)
        {
            return DP[amount].count;
        }
        else
        {
            return -1;
        }
    }
}