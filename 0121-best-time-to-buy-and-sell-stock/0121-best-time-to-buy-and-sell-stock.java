class Solution {
      public int maxProfit(int[] prices) {
          int siz=prices.length;
          if(siz==2)
          {
            return Math.max(prices[1]-prices[0],0);
          }
        int[]preMin=new int[siz];
        int[]preMax=new int[siz];
        int mn=Integer.MAX_VALUE;int mx=Integer.MIN_VALUE;
          for (int i = 0; i < siz-1; i++) {
              mn=Math.min(mn,prices[i]);
              preMin[i]=mn;
          }
          for (int i = siz-1; i >0 ; i--) {
              mx=Math.max(mx,prices[i]);
              preMax[i]=mx;
          }
          preMax[0]=-10000*100;
          preMin[siz-1]=10000*100;
          int profit=-1;
          for (int i = 0; i < siz; i++) {
                profit=Math.max(profit,preMax[i]-preMin[i]);
          }
          return Math.max(profit, 0);
      }
  }
