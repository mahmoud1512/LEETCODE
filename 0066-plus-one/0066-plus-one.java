class Solution {
    public int[] plusOne(int[] digits) {
        int x=1;
        int siz=digits.length-1;
        while(siz!=-1)
            {
                int v=digits[siz]+x;
                x=v/10;
                digits[siz]=v%10;
                siz--;
                if(x==0)
                    break;
                if(siz==-1&&x!=0)
                    return construct(digits,x);
            }
        return digits;
        
    }
    int[]construct(int[]digits,int x)
    {
        int siz=digits.length;
        int[]ans=new int[siz+1];
        ans[0]=x;
        for(int i=0;i<siz;i++)
            {
                ans[i+1]=digits[i];
            }
        return ans;
    }
}