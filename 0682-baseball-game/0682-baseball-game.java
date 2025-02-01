class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer>game=new Stack<>();
        for (String s:operations) {
            if(s.equals("C"))
            {
                game.pop();
            } else if (s.equals("D")) {
                game.push(2*game.peek());
            }
            else if (s.equals("+"))
            {
                int x=game.pop();
                int y=x+game.peek();
                game.push(x);
                game.push(y);
            }
            else
            {
                game.push(Integer.parseInt(s));
            }
                
        }
        int sum=0;
        while(!game.isEmpty())
        {
            sum+=game.pop();
        }
        return sum;
    }
}
