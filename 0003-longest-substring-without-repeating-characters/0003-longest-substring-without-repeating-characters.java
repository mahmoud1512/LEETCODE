class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int len=s.length();
        // sliding window with condition that all characters are unique
        // when entering a new element we must empty its duplicates from window
        // then check the max length;
        int maxLen=0;
        int left=0;
        Set<Character>discoverdElements=new HashSet<>();  // window state

        for (int i = 0; i < len ; i++) {
            
            while (discoverdElements.contains(s.charAt(i)))
            {
                discoverdElements.remove(s.charAt(left));
                left++;
            }
            discoverdElements.add(s.charAt(i));
            maxLen=Math.max(maxLen,i-left+1);
                
        }
        return maxLen;
        
    }
}