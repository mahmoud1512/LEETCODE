class Solution {
    
    public int numIslands(char[][] grid) {

        int count=0;
        int n=grid.length,m=grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j]=='1')
                {
                    count++;
                    dfs(i,j,grid);
                }
                    
            }
        }
        return count;
    }

    private void dfs(int i, int j, char[][] grid) {
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0')
            return;
        
        grid[i][j]='0';
        dfs(i+1,j,grid);
        dfs(i,j+1,grid);
        dfs(i-1,j,grid);
        dfs(i,j-1,grid);
        
    }
}