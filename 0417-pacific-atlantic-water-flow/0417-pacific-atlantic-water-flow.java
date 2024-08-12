class Solution {
    int Rows,Cols;
    Set<List<Integer>>Pacific=new HashSet<>();
    Set<List<Integer>>Atlantic=new HashSet<>();
    List<List<Integer>>ans=new ArrayList<>();
    int[][]H;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
         Rows=heights.length; Cols=heights[0].length;
         H=heights;
        for (int i = 0; i < Cols; i++) {
            dfs(0,i,Pacific,heights[0][i]);
            dfs(Rows-1,i,Atlantic,heights[Rows-1][i]);
        }
        for (int i = 0; i < Rows; i++) {
            dfs(i,0,Pacific,heights[i][0]);
            dfs(i,Cols-1,Atlantic,heights[i][Cols-1]);
        }
        for (List<Integer>x:Pacific) {
            if (Atlantic.contains(x))
                ans.add(x);
        }
        return ans;
    }
    void dfs(int r,int c,Set<List<Integer>>approved,int val)
    {
        List<Integer>list=List.of(r,c);
        if(approved.contains(list)||r<0||r>=Rows||c<0||c>=Cols||H[r][c]<val)
            return;
        approved.add(list);
        dfs(r+1,c,approved,H[r][c]);
        dfs(r-1,c,approved,H[r][c]);
        dfs(r,c+1,approved,H[r][c]);
        dfs(r,c-1,approved,H[r][c]);
        
    }
}