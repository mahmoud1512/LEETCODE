class Solution {
    public String decodeString(String s) {
        int len=s.length();
        Stack<Character>characters=new Stack<>();
        for (int i = 0; i < len; i++) {
            if(s.charAt(i)==']')
            {
                StringBuilder reversedString= new StringBuilder();
                StringBuilder reversedNumber= new StringBuilder();
                while(characters.peek()!='[')
                {
                    reversedString.append(characters.pop());
                }
                characters.pop();
                while (!characters.isEmpty()&&isnum(characters.peek()))
                {
                    reversedNumber.append(characters.pop());
                }
                String Data=reversedString.reverse().toString();
                int x=Data.length();
                String num=reversedNumber.reverse().toString();
                int value=Integer.parseInt(num);
                for (int j = 0; j < value; j++) {
                    for (int k = 0; k < x; k++) {
                        characters.push(Data.charAt(k));
                    }
                }


            }
            else
                characters.push(s.charAt(i));

        }
        StringBuilder ans=new StringBuilder();
        while(!characters.isEmpty())
        {
            ans.append(characters.pop());
        }
        return ans.reverse().toString();
    }

    private boolean isnum(Character peek) {
        int ascii=(int)peek;
        return ascii<=57&&ascii>=48;
    }
}