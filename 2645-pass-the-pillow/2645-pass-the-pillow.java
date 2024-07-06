class Solution {
    public int passThePillow(int n, int time) {
              int passes=time/(n-1);
              int moves=time%(n-1);
              if(passes%2==0)
              {
                  return 1+moves;
              }
              else
              {
                  return n-moves;
              }
    }
}