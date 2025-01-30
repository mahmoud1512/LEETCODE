class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer>sol=new ArrayList<>();
        int slen=s.length();
        int plen=p.length();
        if(slen<plen)
          return sol;
        int[]Additions=getStats(p,plen);
        int[]Deletions=new int[26];
        int additionsCount=0;
        int deletionsCount=0;
        for (int i = 0; i < 26; i++) {
            //Additions[i]=StringS[i];
            additionsCount+=Additions[i];
        }

        for (int i = 0; i < plen; i++) {

            if(Additions[s.charAt(i)-'a']>=1)
            {
                Additions[s.charAt(i)-'a']--;
                additionsCount--;
                if(additionsCount+deletionsCount==0)
                    sol.add(0);
            }
            else  {
                Deletions[s.charAt(i)-'a']++;
                deletionsCount++;
            }

        }
        int end=slen-plen;
        int increase=plen-1;
        for (int i = 1; i <= end ; i++) {

            int cd=s.charAt(i-1)-'a';
            int ad=s.charAt(i+increase)-'a';
            if(Deletions[cd]>=1) {
                Deletions[cd]--;
                deletionsCount--;
            }
            else
            {
                Additions[cd]++;
                additionsCount++;
            }

            if(Additions[ad]>=1)
            {
                Additions[ad]--;
                additionsCount--;
                if(additionsCount+deletionsCount==0)
                    sol.add(i);
            }
            else  {
                Deletions[ad]++;
                deletionsCount++;
            }



        }
        return sol;
    }

    private int[] getStats(String s,int len) {
        int[]arr=new int[26];
        for (int i = 0; i < len; i++) {
            arr[s.charAt(i)-'a']++;
        }
        return arr;
    }

}