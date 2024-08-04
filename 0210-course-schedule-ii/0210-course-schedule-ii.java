class Solution {
    boolean[] Visited;
    int[]PathStack;
    ArrayList<ArrayList<Integer>> graph;
    int size;
    int[] ans;
    boolean done=true;

    public int[] findOrder (int numCourses, int[][] prerequisites) {    //Directed Acyclic (NO cycles)
        graph = new ArrayList<>();
        Visited = new boolean[numCourses];
        PathStack=new int[numCourses];
        size = numCourses - 1;
        ans = new int[size + 1];
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        int siz = prerequisites.length;
        for (int i = 0; i < siz; i++) {
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (!Visited[i]) {
                dfs(i);
            }
        }
        if(!done)
            return new int[0];
        return ans;
    }

    void dfs(int i) {
        if(Visited[i]&&PathStack[i]==1)
        {
            done=false;
            return;
        }
        if (Visited[i])
            return;
        Visited[i] = true;PathStack[i]=1;
        for (int x : graph.get(i)) {
            dfs(x);
        }
        PathStack[i]=0;
        ans[size--] = i;
    }
}