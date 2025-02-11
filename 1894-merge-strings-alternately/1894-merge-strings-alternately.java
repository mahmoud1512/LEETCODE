class Solution {
    public String mergeAlternately(String word1, String word2) {
          int siz1=word1.length(); int siz2=word2.length();
          int i1=0,i2=0;
          StringBuilder builder=new StringBuilder();
          while (i1<siz1&&i2<siz2)
          {
              builder.append(word1.charAt(i1));
              i1++;
              builder.append(word2.charAt(i2));
              i2++;
          }
          while(i1<siz1)
          {
              builder.append(word1.charAt(i1));
              i1++;
          }
          while (i2<siz2)
          {
              builder.append(word2.charAt(i2));
              i2++;
          }
          return new String(builder);
    }
}