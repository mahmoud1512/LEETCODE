class Solution {
    public int[] findRedundantConnection(int[][] edges) {
             int n=edges.length;
             int[]parent=new int[n+1];
             int[]rank=new int[n+1];
                     
        for (int i = 1; i <= n; i++) {
            parent[i]=i;
            rank[i]=1;
        }
        DSU dsu=new DSU(parent,rank);
        int[]ans = new int[2];
        for (int[]x:edges)
        {
            if(!dsu.Union(x[0],x[1]))
            {
                ans=x;
            }
        }
       return ans;      
    }
}
class DSU
{
    int[]Parent;
    int[]Rank;

    public DSU(int[] parent, int[] rank) {
        Parent = parent;
        Rank = rank;
    }

    int find(int x)
    {
        while(x!=Parent[x])
        {
            x=Parent[x];
            Parent[x]=Parent[Parent[x]];
        }
        return Parent[x];
    }
    boolean Union(int x, int y)
    {
        int fx=find(x);
        int fy=find(y);
        if(fx!=fy)
        {
            if(Rank[fx]>=Rank[fy])
            {
                Parent[fy]=fx;
                Rank[fx]+=Rank[fy];
                Rank[fy]=0;
                
            }
            else {
                Parent[fx] = fy;
                Rank[fy]+=Rank[fx];
                Rank[fx]=0;
            }
            return true;
        }
        else 
            return false;
        
    }
}