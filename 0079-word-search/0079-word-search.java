class Solution {
    char[][]grid;
    boolean[][]visited;
    int Rows,Cols;
    String target;
    public boolean exist(char[][] board, String word) {
            target=word;
            grid=board;
            Rows=board.length;
            Cols=board[0].length;
            visited=new boolean[Rows][Cols];
            boolean ans=false;
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Cols; j++) {
                if(word.charAt(0)==board[i][j])
                    ans=ans||solve(i,j,"");
                if(ans)
                    return ans;
            }
        }
        return false;
    }

    private boolean solve(int i, int j, String s) {
        
        if(s.equals(target))
            return true;
        if(i<0||i>=Rows||j<0||j>=Cols||visited[i][j]||s.length()>=target.length())
            return false;
         visited[i][j]=true;
         String x=s+grid[i][j];
        boolean p1=solve(i+1,j,x);
        boolean p2=solve(i-1,j,x);
        boolean p3=solve(i,j+1,x);
        boolean p4=solve(i,j-1,x);
        visited[i][j]=false;
        return p1||p2||p3||p4;
    }
}