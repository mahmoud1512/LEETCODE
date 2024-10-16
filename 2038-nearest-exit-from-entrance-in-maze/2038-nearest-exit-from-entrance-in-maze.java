class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int rows=maze.length,cols=maze[0].length;
        Queue<Integer>BFS_QueueX=new ArrayDeque<>();
        Queue<Integer>BFS_QueueY=new ArrayDeque<>();
        BFS_QueueX.add(entrance[0]);
        BFS_QueueY.add(entrance[1]);
       
        int steps=0;
        int level=1;
        int added;
        boolean [][]visited=new boolean[rows][cols];
        visited[entrance[0]][entrance[1]]=true;
        int[][]directions={{1,0},{0,1},{-1,0},{0,-1}};
        while(!BFS_QueueX.isEmpty())
        {
            added=0;
            for (int i = 0; i < level; i++) {
                int polledX=BFS_QueueX.poll();
                int polledY=BFS_QueueY.poll();
                if((polledX==0||polledX==rows-1||polledY==cols-1||polledY==0)&&steps!=0)
                    return steps;
                for(int[] direction:directions)
                {
                    int x=polledX+direction[0];
                    int y=polledY+direction[1];
                    if(x<=rows-1&&x>=0&&y<=cols-1&&y>=0)
                    {
                        if(maze[x][y]!='+'&&!visited[x][y]){
                            added++;
                            BFS_QueueX.add(x);
                            BFS_QueueY.add(y);
                            visited[x][y]=true;
                        }

                    }
                }
            }
            level=added;
            steps++;
        }
        return -1;
    }
}