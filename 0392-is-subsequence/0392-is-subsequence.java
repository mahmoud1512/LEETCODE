class Solution {
    public boolean isSubsequence(String s, String t) {
          
        int p1=0,e1=s.length();
        int p2=0,e2=t.length();
        while (p1<e1&&p2<e2)
        {
            if(s.charAt(p1)==t.charAt(p2))
            {
                p1++;
                p2++;
            }
            else
            {
                p2++;
            }
        }
        return p1>=e1;
        
    }
}