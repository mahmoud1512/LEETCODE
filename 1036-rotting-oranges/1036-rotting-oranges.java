class Solution {
    int n, m;

    public int orangesRotting(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) queue.add(new int[]{i, j});   //add sources
            }
        }
        //For each BFS level be on a single lap
        int siz = queue.size();
        int depth = 0;
        int time=0;
        boolean enter=false;
        while (!queue.isEmpty()) {
            depth=0;
            for (int i = 0; i < siz; i++) {
                  int[]elem=queue.poll();
                  if(elem[0]+1<n&&grid[elem[0]+1][elem[1]]==1)
                  {
                      grid[elem[0]+1][elem[1]]=2;
                      queue.add(new int[]{elem[0]+1,elem[1]});
                      enter=true;
                       depth++;
                  }
                if(elem[0]-1>=0&&grid[elem[0]-1][elem[1]]==1)
                {
                    grid[elem[0]-1][elem[1]]=2;
                    queue.add(new int[]{elem[0]-1,elem[1]});
                    enter=true;
                     depth++;
                }
                if(elem[1]+1<m&&grid[elem[0]][elem[1]+1]==1)
                {
                    grid[elem[0]][elem[1]+1]=2;
                    queue.add(new int[]{elem[0],elem[1]+1});
                    enter=true;
                     depth++;
                }
                if(elem[1]-1>=0&&grid[elem[0]][elem[1]-1]==1)
                {
                    grid[elem[0]][elem[1]-1]=2;
                    queue.add(new int[]{elem[0],elem[1]-1});
                    enter=true;
                     depth++;
                }
                 
            }
            siz=depth;
            if(enter)
              time++;
            enter=false;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j]==1)
                    return -1;
            }
        }
        return time;
    }
}
