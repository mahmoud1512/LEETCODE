class Solution {
    public int findCenter(int[][] edges) {
        int[]count=new int[100005];
          int siz=edges.length;
          int mx=0;int ans=-1;
        for (int i = 0; i < siz; i++) {
            count[edges[i][0]]++;
            if(count[edges[i][0]]>mx)
            {
                mx=count[edges[i][0]];
                ans=edges[i][0];
            }
            count[edges[i][1]]++;
            if(count[edges[i][1]]>mx)
            {
                mx=count[edges[i][1]];
                ans=edges[i][1];
            }
        }
        return ans;
    }
}