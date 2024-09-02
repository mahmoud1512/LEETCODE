class Solution {
    boolean[]visited;
    List<List<Integer>>ans;
    List<Integer>permutation;
    int[]Nums;
    int siz;
    public List<List<Integer>> permute(int[] nums) {
        Nums=nums;
         siz= nums.length;
        visited=new boolean[siz];
        permutation=new ArrayList<>();
        ans=new ArrayList<>();
        solve(0);
        return ans;
    }

    private void solve(int i) {
        if(i==siz)
        {
            ans.add(new ArrayList<>(permutation));
        }
        for (int j = 0; j < siz; j++) {
            if(visited[j])
                continue;
            visited[j]=true;
            permutation.add(Nums[j]);
            solve(i+1);
            permutation.remove(permutation.size()-1);
            visited[j]=false;
        }
    }
}