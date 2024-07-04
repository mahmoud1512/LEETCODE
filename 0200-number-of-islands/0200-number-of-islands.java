class Solution {
    char [][]grid2;
    int [][]visited=new int[302][302];
    public int numIslands(char[][] grid) {

        grid2=grid.clone();

        int count=0;
        int rows=grid.length;
        int cols=grid[0].length;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(grid2[i][j]=='1')
                {
                    dfs(i,j);
                    count++;
                }
            }
        }
      return count;
    }
    public void dfs(int i,int j)
    {
        if (i>=grid2.length||i<0||j>=grid2[0].length||j<0||visited[i][j]==1||grid2[i][j]=='0')
            return;
        grid2[i][j]='0';
        visited[i][j]=1;
        
        dfs(i+1,j);
        dfs(i,j+1);
        dfs(i-1,j);
        dfs(i,j-1);
    }

}