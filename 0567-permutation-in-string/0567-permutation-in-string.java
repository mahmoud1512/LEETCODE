class Solution {
      int[]string1=new int[28];
      int[]string2=new int[28];
      int siz1,siz2;
    public boolean checkInclusion(String s1, String s2) {
        siz1=s1.length();siz2=s2.length();
        for (int i = 0; i < siz1; i++) {
            string1[s1.charAt(i)-'a']++;
        }
        int l=0,r=0;
        while (l<siz2)
        {
            while (r<siz2&&can(s2.charAt(r)))
            {
                string2[s2.charAt(r)-'a']++;
                r++;
            }
            boolean x=checkend();
            if(x)
                return x;
            string2[s2.charAt(l)-'a']--;
            l++;
        }
        return false;
    }
    boolean can(char p)
    {
        return string1[p-'a']>=string2[p-'a']+1;

    }
    boolean checkend()
    {
        for (int i = 0; i < 26; i++) {
            if(string1[i]!=string2[i])
                return false;
        }
        return true;
    }
}

//same size //same letters //same frequency of them