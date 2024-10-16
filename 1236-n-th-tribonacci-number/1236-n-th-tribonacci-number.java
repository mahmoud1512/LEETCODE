class Solution {
    int []memo=new int[50];
    public int tribonacci(int n) {
        if(n==0)
           return 0;
        else if(n<=2)
            return 1;
        else
        {
            if(memo[n]!=0)
            {
                return memo[n];
            }
            else
            {
                memo[n]=tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
                return memo[n];
            }
        }       

    }
}