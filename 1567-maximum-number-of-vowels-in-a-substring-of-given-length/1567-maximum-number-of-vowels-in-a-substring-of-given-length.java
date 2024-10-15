class Solution {
    public int maxVowels(String s, int k) {
         int l=0,r=0,count=0,max=0;
         int siz=s.length();
         while(r<k)
         {
             if(isVowel(s.charAt(r)))
             {
                 count++;
             }
             r++;
         }
         max=Math.max(max,count);
         while(r!=siz)
         {
             if(isVowel(s.charAt(l)))
             {
                 count--;
             }
             if(isVowel(s.charAt(r)))
                 count++;
             max=Math.max(max,count);
             l++;
             r++;
         }
         return max;
    }

    private boolean isVowel(char c) {
        return "aoieu".indexOf(c)!=-1;
    }
}