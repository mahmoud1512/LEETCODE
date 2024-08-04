class Solution {
      boolean[][]visited;
    int width;
    int length;
    int[][]Grid;
    public int maxAreaOfIsland(int[][] grid) {
            int mx=0;
            width=grid.length;
            length=grid[0].length;
            Grid=grid;
            visited=new boolean[width][length];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                if(!visited[i][j]&&grid[i][j]==1)
                    mx=Math.max(mx,dfs(i,j));
            }
        }
        return mx;
    }
    int dfs(int i,int j)
    {
        if(i>=width||i<0||j>=length||j<0||visited[i][j]||Grid[i][j]==0)
            return 0;
        visited[i][j]=true;
        return Grid[i][j]+dfs(i+1,j)+dfs(i-1,j)+dfs(i,j+1)+dfs(i,j-1);
        
    }
}