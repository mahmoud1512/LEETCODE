class node
  {
      int val,place;

      public node(int val, int place) {
          this.val = val;
          this.place = place;
      }
  }
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int siz=temperatures.length-1;
        Stack<node>stack=new Stack<>();
        int []ans=new int[siz+1];
        for (int i = siz; i >=0 ; i--) {
           if(stack.isEmpty())
           {
               ans[i]=0;
               stack.push(new node(temperatures[i],i));
           }
           else
           {
               while (!(stack.isEmpty())&&stack.peek().val<=temperatures[i])
               {
                   stack.pop();
               }
               if(stack.isEmpty())
               {
                   ans[i]=0;
                   stack.push(new node(temperatures[i],i));
               }
               else
               {
                   ans[i]=stack.peek().place-i;
                   stack.push(new node(temperatures[i], i));
               }
           }
        }
        return ans;
    }
}
