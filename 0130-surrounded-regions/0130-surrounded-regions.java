class Solution {
    boolean[][]visited;
    char[][]dummyBoard;
    int n,m;

    public void solve(char[][] board) {
        n=board.length;
        m=board[0].length;
        visited=new boolean[n][m];
        dummyBoard=board;

        for (int j = 0; j < m; j++) {
            if(board[0][j]=='O'&&!visited[0][j])
            {
                dfs(0,j);
            }
        }
        for (int j = 0; j < m; j++) {
            if(board[n-1][j]=='O'&&!visited[n-1][j])
            {
                dfs(n-1,j);
            }
        }
        for (int i = 0; i < n; i++) {
            if(board[i][0]=='O'&&!visited[i][0])
            {
                dfs(i,0);
            }
        }
        for (int i = 0; i < n; i++) {
            if(board[i][m-1]=='O'&&!visited[i][m-1])
            {
                dfs(i,m-1);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(!visited[i][j]&&board[i][j]=='O')
                    board[i][j]='X';
            }
        }
    }
    void dfs(int i,int j)
    {
        if(visited[i][j])
            return;
        visited[i][j]=true;

        if(valid(i+1,j))
        {
            dfs(i+1,j);
        }
        if(valid(i-1,j))
        {
            dfs(i-1,j);
        }
        if(valid(i,j+1))
        {
            dfs(i,j+1);
        }
        if(valid(i,j-1))
        {
            dfs(i,j-1);
        }
    }

    private boolean Corner(int i, int j) {
        if(i==0||i==n-1||j==0||j==m-1)
            return true;
        return false;
    }

    private boolean valid(int i, int j) {
        if(i<n&&i>=0&&j<m&&j>=0&&dummyBoard[i][j]=='O')
            return true;
        return false;
    }

}