class Solution {
    public int findCenter(int[][] edges) {
          int[]v1=edges[0];
          int[]v2=edges[1];
          if((v1[0]==v2[0])||(v1[0]==v2[1]))
              return v1[0];
          else
              return v1[1];
          
          
              
    }
}