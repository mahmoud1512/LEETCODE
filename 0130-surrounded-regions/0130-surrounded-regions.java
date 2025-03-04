public class Solution {
    public void solve(char[][] board) {
        if(board == null || board.length == 0) return;
        
        int rows = board.length, cols = board[0].length;
        
        // Mark all 'O's connected to borders as safe ('E')
        for (int i = 0; i < rows; i++) {
            dfs(board, i, 0, rows, cols);
            dfs(board, i, cols - 1, rows, cols);
        }
        for (int j = 0; j < cols; j++) {
            dfs(board, 0, j, rows, cols);
            dfs(board, rows - 1, j, rows, cols);
        }
        
        // Flip remaining 'O's to 'X' and revert 'E's back to 'O'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if(board[i][j] == 'E') {
                    board[i][j] = 'O';
                }
            }
        }
    }
    
    private void dfs(char[][] board, int i, int j, int rows, int cols) {
        if(i < 0 || i >= rows || j < 0 || j >= cols || board[i][j] != 'O') {
            return;
        }
        
        board[i][j] = 'E'; // Mark cell as safe
        
        dfs(board, i - 1, j, rows, cols);
        dfs(board, i + 1, j, rows, cols);
        dfs(board, i, j - 1, rows, cols);
        dfs(board, i, j + 1, rows, cols);
    }
}
