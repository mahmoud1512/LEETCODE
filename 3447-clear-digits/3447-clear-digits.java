class Solution {
    public String clearDigits(String s) {
        Stack<Character> characters=new Stack<>();
        int len=s.length();
        for (int i = 0; i < len; i++) {
            if(Character.isDigit(s.charAt(i)))
                characters.pop();
            else
                characters.push(s.charAt(i));
        }
        StringBuilder builder=new StringBuilder();
        while (!characters.isEmpty())
        {
            builder.append(characters.pop());
        }
        return new String(builder.reverse());
    }
}