class Solution {

      int[]arrT=new int[60];
      int[]arrS=new int[60];
//      Map<Character,Integer>mpT=new HashMap<>();
//      Map<Character,Integer>mpS=new HashMap<>();
      int siz1,siz2;
    int l=0,r=0;
    public String minWindow(String s, String t) {
          siz1=t.length();
          siz2=s.length();
        for (int i = 0; i < siz1; i++) {
            char x=t.charAt(i);
            arrT[x-'A']++;
        }

        int min=Integer.MAX_VALUE;int st=-1,end=-1;
        while (l<siz2)
        {
            while (r<siz2&&can(s.charAt(r)))
            {
                char x=s.charAt(r);
                arrS[x-'A']++;
                r++;
            }
            boolean c=checkend();
            if(c&&(r-l)<min)
            {
                min=r-l;
                st=l;
                end=r-1;
            }
            char x=s.charAt(l);
            arrS[x-'A']--;
            l++;
        }
        if(min!=Integer.MAX_VALUE)
        {
            String ans="";
            for (int i = st; i <=end ; i++) {
                ans+=s.charAt(i);
            }
            return ans;
        }
        return "";
    }
    boolean can(char p)
    {
        if(arrT[p-'A']==0)
        {
            return !checkend();
        }
        else
        {
            if(arrS[p-'A']==0)
                return true;
            else
                return !checkend();
        }

    }
    boolean checkend()
    {
        for (int i=0;i<60;i++)
        {
            if(arrS[i]<arrT[i])
                return false;
        }
        return true;
    }
}