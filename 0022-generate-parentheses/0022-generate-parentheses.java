class Solution {
    int siz;
    int mx;
    List<String>ans=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        siz=2*n-2;
        mx=n;
        char[]arr=new char[2*n];
        generate(1,0,arr);
        return ans;
    }
    void generate(int num,int place,char[]arr)
    {

        if(num>mx)
            return;
        if (place>siz)
            return;
        arr[place]='(';
        if(num==mx) {
            close(arr);
            return;
        }
        int l=num+1;
        for (int i = 1; i <=siz ; i++) {
            int v=place+i;
            if(v<=siz)
                generate(l,v,arr.clone());
        }


    }
    void close(char[]arr)
    {
        int size=2*mx;
        int before=0;
        int after=0;
        for (int i = 0; i < size; i++) {
            if(arr[i]=='(')
            {
                  if(after>before)
                      return;
                  before++;
            }
            else
            {
                   arr[i]=')';
                   after++;
            }
        }
        ans.add(new String(arr));
    }
}