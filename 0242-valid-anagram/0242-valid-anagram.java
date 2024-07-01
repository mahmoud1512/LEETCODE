class Solution {
    public boolean isAnagram(String s, String t) {
          int sLength=s.length(),tLength=t.length();
          if(sLength!=tLength)
              return false;
          int []count1=new int[26];
          int []count2=new int[26];

        for (int i = 0; i < sLength; i++) {
            count1[s.charAt(i)-'a']++;
            count2[t.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(count1[i]!=count2[i])
                return false;
        }
        return true;
    }
}