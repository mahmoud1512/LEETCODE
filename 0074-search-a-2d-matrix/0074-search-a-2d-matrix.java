class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length; int m=matrix[0].length;
        int k=0;
        int[]nums=new int[n*m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[k]=matrix[i][j];
                k++;
            }
        }
        return Arrays.binarySearch(nums,target)>=0;
    }
}