class Solution {
    public boolean isPalindrome(String s) {

        int l=0,r=s.length()-1;
        while (l<=r)   // اقصى حاجة انا سمحت بيها انهم يعدوا بعض بواحد
        {
            while(!alphanumeric(s.charAt(l))&&l<r)    // اقصى حاجة سمحت بيها التساوي
                l++;
            while (!alphanumeric(s.charAt(r))&&l<r)
                r--;

            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r)))
                return false;
            else
            {
                l++;
                r--;
            }

        }
        return true;

    }

    private boolean alphanumeric(char c) {
        return Character.isDigit(c)||Character.isAlphabetic(c);
    }
}