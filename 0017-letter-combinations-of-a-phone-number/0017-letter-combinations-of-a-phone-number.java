class Solution {
    Map<Character,char[]>map;
    List<String>ans;
    
    public List<String> letterCombinations(String digits) {
        map=new HashMap<>();
        ans=new ArrayList<>();
        if(digits.isEmpty())
          return ans;
        
        map.put('2',new char[]{'a','b','c'});
        map.put('3',new char[]{'d','e','f'});
        map.put('4',new char[]{'g','h','i'});
        map.put('5',new char[]{'j','k','l'});
        map.put('6',new char[]{'m','n','o'});
        map.put('7',new char[]{'p','q','r','s'});
        map.put('8',new char[]{'t','u','v'});
        map.put('9',new char[]{'w','x','y','z'});
        solve(0,"",digits);
        return ans;
    }

    private void solve(int i, String s,String digits) {
        if(i==digits.length())
        {
            ans.add(s);
            return;
        }
        char x=digits.charAt(i);
        char[]chars=map.get(x);
        for (char c:chars)
        {
            String a=s+c;
            solve(i+1,a,digits);
        }
    }
}