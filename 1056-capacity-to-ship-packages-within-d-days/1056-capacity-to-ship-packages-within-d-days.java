class Solution {
      int[]temp;
      int siz;
      int days;
    public int shipWithinDays(int[] weights, int days) {
            temp=weights;
            siz=weights.length;
            this.days=days;
            long l=1,r= (long) Math.ceil(2500000000l/(double)days);
            long ans=r;
            while(l<=r)
            {
                long m=l+(r-l)/2;
                if(can(m))
                {
                    ans=m;
                    r=m-1;
                }
                else
                    l=m+1;
            }
          return (int)ans;
    }
    boolean can(long x)
    {
        int p=0;
        long sum=0;
        int d=0;
        while (p<siz)
        {
            if(temp[p]>x)
                return false;
            while (p<siz&&sum+temp[p]<=x)
            {
                sum+=temp[p];
                p++;
            }
            d++;
            sum=0;
        }
        return d<=days;
    }
}