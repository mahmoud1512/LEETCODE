class Solution {


    public String minWindow(String s, String t) {

        int lenS=s.length();
        int lenT=t.length();
        Map<Character,Integer>freqMapT=new HashMap<>();
        for (int i = 0; i < lenT; i++) {
            freqMapT.merge(t.charAt(i), 1, Integer::sum);
        }
        String minWidow=".";
        int l=0;  // initialize left
        // window state
        Map<Character,Integer>freqMapS=new HashMap<>();

        for (int i = 0; i < lenS; i++) {

            freqMapS.merge(s.charAt(i),1,Integer::sum);
            while(satisfiesCondition(freqMapT,freqMapS)&&l<=i)
            {
                if(minWidow.equals(".")||minWidow.length()>=i-l+1)
                {
                    minWidow=s.substring(l,i+1);
                }
                freqMapS.put(s.charAt(l),freqMapS.get(s.charAt(l))-1);
                l++;
            }

        }

        return minWidow.equals(".")?"":minWidow;


    }
    private boolean satisfiesCondition(Map<Character,Integer>x1,Map<Character,Integer>x2)
    {
        for (Character c:x1.keySet())
        {
            if(!x2.containsKey(c))
                return false;
            if(x1.get(c)>x2.get(c))
                return false;
        }
        return true;
    }
}