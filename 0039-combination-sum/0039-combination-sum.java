class Solution {
    List<List<Integer>>ans;
    List<Integer>group;
    int[]Values;
    int siz;
    int aim;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans=new ArrayList<>();
        group=new ArrayList<>();
        Values=candidates;
        siz=candidates.length;
        aim=target;
        solve(0,0);
        return ans;
    }
    void solve(int idx,long sum)
    {
        if(sum>aim||idx>=siz)
            return;
        if(sum==aim) {
            ans.add(new ArrayList<>(group));
            return;
        }
        //Two paths either add candidates[idx] or move to another idx
        group.add(Values[idx]);
        solve(idx,sum+Values[idx]);
        group.remove(group.size()-1);
        solve(idx+1,sum);
    }
}