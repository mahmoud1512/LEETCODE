class Solution {
    List<List<String>>ans;
    List<String>curr;
    String t;
    int len;
    public List<List<String>> partition(String s) {
        t=s;
        len=s.length();
        ans=new ArrayList<>();
        curr=new ArrayList<>();
        solve(0);
       return ans;
    }

    private void solve(int st) {
        if(st==len)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = st; i < len ; i++) {
            String x=t.substring(st,i+1);
            if(Palin(x)) {
                curr.add(x);
                solve(i + 1);
                curr.remove(curr.size() - 1);
            }
        }
    }

    private boolean Palin(String x) {
        int l=0,r=x.length()-1;
        while (l<=r)
        {
            if(x.charAt(l)!=x.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }

}