class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=0;int wait=0;
        while(numBottles+wait>=numExchange)
        {
            //Drink
            ans+=numBottles;
            //exchange
            int temp=(numBottles+wait);
            numBottles=temp/numExchange;
            wait=temp%numExchange;

        }
        return ans+numBottles;
    }
}