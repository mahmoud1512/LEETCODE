class Solution {
    public boolean isPalindrome(String s) {
            String x="";
            int siz=s.length();
        for (int i = 0; i < siz; i++) {
            if((int)s.charAt(i)<=90&&(int)s.charAt(i)>=65)
                x=x+Character.toLowerCase(s.charAt(i));
            else if ((int)s.charAt(i)<=122&&(int)s.charAt(i)>=97) {
                x=x+s.charAt(i);
            } else if ((int)s.charAt(i)<=57&&(int)s.charAt(i)>=48) {
                x=x+s.charAt(i);
            }
        }
        return solve(x);
    }
    boolean solve(String x)
    {
        int l=0,r=x.length()-1;
        while (l<r)
        {
            if(!(x.charAt(l)==x.charAt(r)))
            {
                return false;
            }
            else
            {
                l++;
                r--;
            }
        }
        return true;
    }
}