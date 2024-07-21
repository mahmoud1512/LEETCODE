class Solution {
    public int[] countBits(int n) {
        int[]ans=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++)
        {
            ans[i]=countOnes(i);
        }
        return ans;
    }
   int countOnes(int x)
    {
        int siz=(int)(Math.log(x)/Math.log(2)+1);
        int ans=x;
        int count=0;
        for (int i = 0; i < siz; i++) {
            int val=ans|(1<<i);
            if(val==ans)
                count++;
            ans=val;
        }
        return count;
    }
}
