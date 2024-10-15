class Solution {
    public boolean isSubsequence(String s, String t) {
           int l=0,r=0;
           int s_Size=s.length();
           int t_Size=t.length();
           while(l<s_Size&&r<t_Size)
           {
               if(s.charAt(l)==t.charAt(r)) {
                   l++;
                   r++;
               }
               else 
                   r++;
           }
           return l==s_Size;
    }
}