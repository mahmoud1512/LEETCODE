class Solution {
    Set<Character>set;
    int replacements;
    int[]counter=new int[28];

    Set<Character>collect=new HashSet<>();
    public int characterReplacement(String s, int k) {
        int siz=s.length();
        set=new HashSet<>();
        replacements=k;

        int l=0,r=0;
        int mx=Integer.MIN_VALUE;
        while(l<siz)
        {
            while(r<siz&&can(s.charAt(r)))
            {
                counter[s.charAt(r)-65]++;
                set.add(s.charAt(r));
                r++;
            }
            mx=Math.max(mx,r-l);
            counter[s.charAt(l)-65]--;
            if(counter[s.charAt(l)-65]==0)
            {
                set.remove(s.charAt(l));
            }
            l++;
        }
        return mx;
    }
    boolean can(char x)
    {
        if(set.isEmpty())
        {
            return true;
        }
        set.add(x);
        boolean x2=false;
        int mx=0;
        char mxChar='a';
        for (char v:set)
        {
            if(v==x) {
                if(mx<counter[x-65]+1)
                {
                    mx=counter[x-65]+1;
                     mxChar=x;
                }
              
            }
            else {
                 if(mx<counter[v-65])
                {
                    mx=counter[v-65];
                     mxChar=v;
                }
            }
        }
        int count=0;
        for (char v:set)
        {
            if(v!=mxChar)
            {
                if(v!=x)
                    count+=counter[v-65];
                else 
                    count+=counter[x-65]+1;
            }
        }
        x2=(count<=replacements);         
        set.remove(x);
        return x2;
    }
}