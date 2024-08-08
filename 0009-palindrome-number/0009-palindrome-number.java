class Solution {
    long n=0;
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int temp=x;
        int len= (int)(Math.log(x)/Math.log(10));
       // System.out.println(len);
        while(temp!=0)
        {
            int v=temp%10;
            n+=v*Math.pow(10,len);
            temp=temp/10;
            len--;
        }
        return x==n;
    }
}