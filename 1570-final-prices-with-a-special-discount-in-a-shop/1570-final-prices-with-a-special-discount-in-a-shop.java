 class node
  {
      int val,place;

      public node(int val, int place) {
          this.val = val;
          this.place = place;
      }
  }

class Solution {
    public int[] finalPrices(int[] prices) {
           Stack<node>stack=new Stack<>();
           int size= prices.length;
           int []ans=prices.clone();
        for (int i = 0; i < size; i++) {
            while (!(stack.isEmpty())&&prices[i]<=stack.peek().val)
            {
                node n=stack.pop();
                ans[n.place]=n.val-prices[i];
            }
            stack.push(new node(prices[i],i ));
        }
        return ans;
    }
}