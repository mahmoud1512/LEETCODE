class Solution {
    public String longestCommonPrefix(String[] strs) {
          StringBuilder builder=new StringBuilder();

          String v=strs[0];
          int len=v.length();
          boolean b=true;
        for (int i = 0; i < len; i++) {
            for (String x:strs) {
                if(x.length()<=i||x.charAt(i)!=v.charAt(i))
                {
                    b=false;
                    break;

                }
            }
            if (b)
            {
                builder.append(v.charAt(i));
            }
        }
        return builder.toString();
    }
}