class Solution {
    public boolean isValid(String s) {
           Stack<Character>ss=new Stack<>();
        int siz=s.length();
        for (int i = 0; i < siz; i++) {
            if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='[')
                ss.add(s.charAt(i));
            else if (s.charAt(i)=='}') {
                char x;
                if(!ss.isEmpty()&&ss.peek()=='{')
                     x=ss.pop();
                else 
                    return false;
            }
            else if (s.charAt(i)==')') {
                char x;
                if(!ss.isEmpty()&&ss.peek()=='(')
                    x=ss.pop();
                else 
                    return false;
            } 
            else if (s.charAt(i)==']') {
                char x;
                if(!ss.isEmpty()&&ss.peek()=='[')
                    x=ss.pop();
                else 
                    return false;
            }
        }
        return ss.isEmpty();
    }
}