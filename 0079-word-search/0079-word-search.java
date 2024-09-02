class Solution {
    char[][]grid;
    boolean[][]visited;
    int Rows,Cols;
    String target;
    int[][]directions={{1,0},{0,1},{-1,0},{0,-1}};
    boolean ans=false;
    public boolean exist(char[][] board, String word) {
        target=word;
        grid=board;
        Rows=board.length;
        Cols=board[0].length;
        visited=new boolean[Rows][Cols];

        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Cols; j++) {
                if(word.charAt(0)==board[i][j])
                {
                    if(solve(i,j,"",0))
                       return true;

                }
            }
        }
        return false;
    }

    private boolean solve(int i, int j, String s,int idx) {
        if(idx==target.length()&&s.equals(target)){
            return true;
        }
        if(idx==target.length())
           return false;
            
        visited[i][j]=true;
        String x=s+grid[i][j];
        for (int[]dir:directions)
        {
            int r=i+dir[0];
            int c=j+dir[1];
            if(valid(r,c,idx+1))
            {
                if (solve(r,c,x,idx+1))
                    ans=true;
            }
        }
        visited[i][j]=false;
        return ans;
    }
    boolean valid(int i,int j,int idx)
    {
        if(idx==target.length())
           return true;
        return !(i<0||i>=Rows||j<0||j>=Cols||visited[i][j]||idx>target.length())&&(target.charAt(idx)==grid[i][j]);
    }

}