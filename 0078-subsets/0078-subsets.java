class Solution {
     int siz;
     List<Integer>subset;
     List<List<Integer>>ans;
     int[]Nums;
    public List<List<Integer>> subsets(int[] nums) {
        Nums=nums;
         subset=new ArrayList<>();
         ans=new ArrayList<>();
         siz=nums.length;
         solve(0);
         return ans;
    }
    void solve(int idx)
    {
       if(idx==siz) {
           ans.add(new ArrayList<>(subset));
           return;
       }
       //take it
       subset.add(Nums[idx]);
       solve(idx+1);
       subset.remove(subset.size()-1);
       solve(idx+1);
    }

}