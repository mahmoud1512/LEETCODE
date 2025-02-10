class Solution {
    public boolean validPalindrome(String s) {

        int len=s.length();
        int l=0,r=len-1;
        while (l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
                return isPalindrome(s,l,r-1)||isPalindrome(s,l+1,r);
            l++;
            r--;
        }
        return true;

    }

    private boolean isPalindrome(String s, int l, int r) {
        while (l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }

}