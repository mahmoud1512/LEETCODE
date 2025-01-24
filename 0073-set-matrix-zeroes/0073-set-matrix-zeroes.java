class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer>rows=new HashSet<>();
        Set<Integer>cols=new HashSet<>();
        int width=matrix.length;
        int length=matrix[0].length;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                if(matrix[i][j]==0)
                {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for (int row:rows) {
            for (int i = 0; i < length; i++) {
                matrix[row][i]=0;
            }
        }
        for (int col:cols)
        {
            for (int i = 0; i < width; i++) {
                matrix[i][col]=0;
            }
        }
    }
}