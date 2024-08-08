class Solution {
    Queue<List<Integer>>PacificQueue=new ArrayDeque<>();
    Queue<List<Integer>>AtlacnticQueue=new ArrayDeque<>();
    List<List<Integer>>ans=new ArrayList<>();
    int[][]gridAtlantic;
    int[][]gridPacific;
    int[][]dummyheights;

    int n,m;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        n=heights.length;
        m=heights[0].length;
        gridAtlantic=new int[n][m];
        gridPacific=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m ; j++) {
                if(i==0||j==0)
                    PacificQueue.add(new ArrayList<>(List.of(i,j)));
                if(i==n-1||j==m-1)
                    AtlacnticQueue.add(new ArrayList<>(List.of(i,j)));
            }
        }
        dummyheights=heights;
        BFSPacific();
        BFSAtlantic();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                if(gridPacific[i][j]==1&&gridAtlantic[i][j]==1)
                    ans.add(new ArrayList<>(List.of(i,j)));
            }
        }
        return ans;
    }
   void BFSPacific()
   {
       int[][]directions={{1,0},{0,1},{-1,0},{0,-1}};
       int siz= PacificQueue.size();
       int depth;
       while (!PacificQueue.isEmpty())
       {
           depth=0;
           for (int i = 0; i < siz; i++) {
               List<Integer>poped= PacificQueue.poll();
               int r=poped.get(0);int c=poped.get(1);
               gridPacific[r][c]=1;
               for (int[]direction:directions)
               {
                   if(Valid(r,c,r+direction[0],c+direction[1])&&gridPacific[r+direction[0]][c+direction[1]]==0)
                   {
                       depth++;
                       PacificQueue.add(new ArrayList<>(List.of(r+direction[0],c+direction[1])));
                   }
               }
           }
           siz=depth;
       }
   }
   void BFSAtlantic()
   {
       int[][]directions={{1,0},{0,1},{-1,0},{0,-1}};
       int siz= AtlacnticQueue.size();
       int depth;
       while (!AtlacnticQueue.isEmpty())
       {
           depth=0;
           for (int i = 0; i < siz; i++) {
               List<Integer>poped= AtlacnticQueue.poll();
               int r=poped.get(0);int c=poped.get(1);
               gridAtlantic[r][c]=1;
               for (int[]direction:directions)
               {
                   if(Valid(r,c,r+direction[0],c+direction[1])&&gridAtlantic[r+direction[0]][c+direction[1]]==0)
                   {
                       depth++;
                       AtlacnticQueue.add(new ArrayList<>(List.of(r+direction[0],c+direction[1])));
                   }
               }
           }
           siz=depth;
       }
   }

    private boolean Valid(int r,int c,int i, int j) {
        if(i<n&&j<m&&i>=0&&j>=0&&dummyheights[r][c]<=dummyheights[i][j])
        {
            return true;
        }
        return false;
    }
}