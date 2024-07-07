class Solution {
    boolean[]visited;
    int target;
    ArrayList<ArrayList<Integer>>graph;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        graph=new ArrayList<>();
        visited=new boolean[n];
        target=destination;
        while(n>0)
        {
            graph.add(new ArrayList<>());
            n--;
        }
        System.out.println(visited[0]);
        int siz=edges.length;

        for (int i = 0; i < siz; i++) {
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);

        }
        dfs(source);
        return visited[destination];
    }
    void dfs(int source)
    {
        
        if(visited[source])
            return;
        visited[source]=true;
        
        for (int x:graph.get(source)) {
            dfs(x);
        }
    }


}