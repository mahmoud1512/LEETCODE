class Solution {
    public String reverseParentheses(String s) {
        Stack<Character>stack=new Stack<>();
        int siz=s.length();
        String change="";
        for (int i = 0; i < siz; i++) {
            if (s.charAt(i)==')')
            {
                change="";
                String temp="";
                while (stack.peek()!='(')
                {
                    temp+=stack.pop();
                }
                stack.pop();
                int len=temp.length();
                for (int j = 0; j < len; j++) {
                    stack.push(temp.charAt(j));
                }
            }
            else{
                stack.push(s.charAt(i));
                //change+=s.charAt(i);
            }

        }
        int siz2=stack.size();
        char[]arr=new char[siz2];
        int j=siz2-1;
        while (!stack.isEmpty())
        {
            arr[j--]=stack.pop();
        }
        return new String(arr);
    }
}