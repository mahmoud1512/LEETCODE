class Solution {

      Map<Character,Integer>mpT=new HashMap<>();
      Map<Character,Integer>mpS=new HashMap<>();
      int siz1,siz2;
    int l=0,r=0;
    public String minWindow(String s, String t) {
          siz1=t.length();
          siz2=s.length();
        for (int i = 0; i < siz1; i++) {
            char x=t.charAt(i);
            if(mpT.containsKey(x))
            {
                mpT.put(x,mpT.get(x)+1);
            }
            else
                mpT.put(x,1);
        }

        int min=Integer.MAX_VALUE;int st=-1,end=-1;
        while (l<siz2)
        {
            while (r<siz2&&can(s.charAt(r)))
            {
                char x=s.charAt(r);
                if(mpS.containsKey(x))
                    mpS.put(x,mpS.get(x)+1);
                else
                    mpS.put(x,1);
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
            if (mpS.get(x)==1)
                mpS.remove(x);
            else
                mpS.put(x,mpS.get(x)-1);
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
        if(!mpT.containsKey(p))
        {
            return !checkend();
        }
        else
        {
            if(!mpS.containsKey(p))
                return true;
            else
                return !checkend();
        }

    }
    boolean checkend()
    {
        for (char v:mpT.keySet())
        {
            if(!mpS.containsKey(v)||mpS.get(v)<mpT.get(v))
                return false;
        }
        return true;
    }
}