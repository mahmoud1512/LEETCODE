class Solution {
    int width;int length;
    public boolean searchMatrix(int[][] matrix, int target) {
         width=matrix.length;length=matrix[0].length;
         int l=0,r=width*length-1;
         while (l<=r)
         { 
            int m=(l+r)/2;
            int []mapped=mapper(m);
            int val=matrix[mapped[0]][mapped[1]];
            if(val==target)
                return true;
            else if (val<target)
                 l=m+1;
            else
                r=m-1;
         }
        return false;
    }
    int[]mapper(int x)
    {
        return new int[]{x/length,x%length};
    }
}