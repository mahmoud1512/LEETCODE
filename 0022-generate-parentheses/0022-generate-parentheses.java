class Solution {
    char[]arr;
    List<String>ans;
    int len;

    public List<String> generateParenthesis(int n) {
          arr=new char[n*2];
          Arrays.fill(arr,'.');
          ans=new ArrayList<>();
          len=2*n;
          solve(0,0);
          return ans;
    }

    private void solve(int open, int closed) {
        if (open==len/2 && closed==len/2)
        {
            ans.add(new String(arr));
            return;
        }
        if(open==len/2)
        {
            arr[open+closed]=')';
            solve(open,closed+1);
            arr[open+closed]='.';
        }
        if(open<len/2)
        {
            arr[open+closed]='(';
            solve(open+1,closed);
            arr[open+closed]='.';

            if(open>closed)
            {
                arr[open+closed]=')';
                solve(open,closed+1);
                arr[open+closed]='.';
            }
        }
    }
}