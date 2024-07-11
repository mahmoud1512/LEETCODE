 class Solution {
    public int[] finalPrices(int[] prices) {
           Stack<Integer>stack=new Stack<>();
           int size= prices.length;
           int []ans=prices.clone();
        for (int i = 0; i < size; i++) {
            while (!(stack.isEmpty())&&prices[i]<=prices[stack.peek()])
            {
                int n=stack.pop();
                ans[n]=prices[n]-prices[i];
            }
            stack.push(i);
        }
        return ans;
    }
}