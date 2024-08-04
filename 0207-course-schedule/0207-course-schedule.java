class Solution {
      int[]PathStack;
      boolean[]Visited;
    ArrayList<ArrayList<Integer>>graph;
    public boolean canFinish(int numCourses, int[][] prerequisites) {    //Directed Acyclic (NO cycles)
             graph=new ArrayList<>();
             PathStack=new int[numCourses];
             Visited=new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        int siz= prerequisites.length;
        for (int i = 0; i <siz ; i++) {
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        boolean can=true;
        for (int i = 0; i < numCourses; i++) {
            if(!Visited[i]) {
                can = dfs(i);
                if(!can)
                    return can;
            }
        }
        return true;
    }
    boolean dfs(int i)
    {
        if(Visited[i]&&PathStack[i]==1)
            return false;
        else if (Visited[i]) {
            return true;
        }
        Visited[i]=true;PathStack[i]=1;
        boolean ans=true;
        for (int x:graph.get(i))
        {
            ans&=dfs(x);
        }
        PathStack[i]=0;
        return ans;
    }
}