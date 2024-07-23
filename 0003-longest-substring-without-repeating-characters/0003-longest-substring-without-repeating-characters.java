class Solution {
    public int lengthOfLongestSubstring(String s) {
           int siz=s.length();
           int l=0,r=0;
           Set<Character>DistinctChars=new HashSet<>();
           int ans=0;
           while(l<siz)
           {
               while (r<siz&&(DistinctChars.contains(s.charAt(r))==false))
               {
                   DistinctChars.add(s.charAt(r));
                   r++;
               }
               ans=Math.max(ans,r-l);
               DistinctChars.remove(s.charAt(l));
               l++;
           }
       return ans;
    }
}