class Solution {
    public String removeStars(String s) {
          Stack<Character>MyStringStack=new Stack<>();
          int siz=s.length();
        for (int i = 0; i < siz; i++) {
            if(s.charAt(i)!='*')
                MyStringStack.push(s.charAt(i));
            else
            {
                if(!MyStringStack.empty())
                    MyStringStack.pop();
                else
                    MyStringStack.push(s.charAt(i));

            }
        }
        StringBuilder strBuilder = new StringBuilder();
        while (!MyStringStack.isEmpty()) {
            strBuilder.append(MyStringStack.pop());
        }
        return strBuilder.reverse().toString();
    }
}