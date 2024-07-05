class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String>stack=new Stack<>();
        int siz=tokens.length;
        if(siz==1)
          return Integer.parseInt(tokens[0]);
        int ans=0;
        for (int i = 0; i < siz; i++) {
            if (tokens[i].equals("+"))
            {
                ans=Integer.parseInt(stack.pop())+Integer.parseInt(stack.pop());
                stack.push(Integer.toString(ans));
            }
            else if (tokens[i].equals("*")) {
                ans=Integer.parseInt(stack.pop())*Integer.parseInt(stack.pop());
                stack.push(Integer.toString(ans));
            } 
            else if (tokens[i].equals("-")) {
                int second=Integer.parseInt(stack.pop());
                int first=Integer.parseInt(stack.pop());
                ans=first-second;
                stack.push(Integer.toString(ans));
            }
            else if (tokens[i].equals("/")) {
               int second=Integer.parseInt(stack.pop());
                int first=Integer.parseInt(stack.pop());
                ans=first/second;
                stack.push(Integer.toString(ans));
            }
            else 
                stack.push(tokens[i]);
        }
        return ans;
    }
}