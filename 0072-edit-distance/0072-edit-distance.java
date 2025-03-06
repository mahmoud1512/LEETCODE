class Solution {
    int [][]dp;
    int n;
    int m;
    String s1;
    String s2;
    public int minDistance(String word1, String word2) {
           n=word1.length(); m=word2.length();
           dp=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j]=Integer.MAX_VALUE;

            }
        }
           s1=word1;s2=word2;
           return solve(0,0);
    }

    int solve(int i,int j)
    {
        if(i==n&&j<m)
        {
            return m-j;
        } else if (i<n&&j==m) {
            return n-i;
        }
        else if(i==n&&j==m)
        {
            return 0;
        }
        if(dp[i][j]!=Integer.MAX_VALUE)
        {
            return dp[i][j];
        } else if (s1.charAt(i)==s2.charAt(j)) {
            dp[i][j]=solve(i+1,j+1);
        }
        else
        {

            dp[i][j]=Math.min(dp[i][j],1+solve(i,j+1)); //insert
            dp[i][j]=Math.min(dp[i][j],1+solve(i+1,j)); //delete
            dp[i][j]=Math.min(dp[i][j],1+solve(i+1,j+1)); //replace
        }

        return dp[i][j];

    }
}