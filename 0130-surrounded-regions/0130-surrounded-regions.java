class Solution {
    boolean[][]visited;
    boolean[][]visited2;
    boolean state;
    public void solve(char[][] board) {

        visited=new boolean[board.length][board[0].length];
        visited2=new boolean[board.length][board[0].length];
        
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[0].length ; j++) {
                state=false;
                if(board[i][j]=='O'&&!visited[i][j])
                {
                    dfs(i,j,board);
                    if(!state)
                    {
                        makeX(i,j,board);
                    }
                }
            }
        }

    }

    private void makeX(int i, int j, char[][] board) {
        if(i<0||j<0||i>=board.length||j>=board[0].length)
        {
            return;
        } else if (board[i][j]=='X'||visited2[i][j]) {
            return;
        }
        visited2[i][j]=true;
        board[i][j]='X';
        makeX(i-1,j,board);
        makeX(i+1,j,board);
        makeX(i,j+1,board);
        makeX(i,j-1,board);
    }

    private void dfs(int i, int j, char[][] board) {
        if(i<0||j<0||i>=board.length||j>=board[0].length)
        {
            state=true;
            return;
        } else if (board[i][j]=='X'||visited[i][j]) {
            return;
        }
        visited[i][j]=true;
        dfs(i-1,j,board);
        dfs(i+1,j,board);
        dfs(i,j+1,board);
        dfs(i,j-1,board);
        
    }
}