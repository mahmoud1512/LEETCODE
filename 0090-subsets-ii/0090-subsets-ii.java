class Solution {
    int siz;
    int[]vals;
    List<List<Integer>>ans;
    List<Integer> subset;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        vals=nums;
        siz=vals.length;
        ans=new ArrayList<>();
        subset=new ArrayList<>();
        helper(0);
        return ans;
    }
    public void helper(int idx)
    {
        if(idx==siz)
        {
            ans.add(new ArrayList<>(subset));
            return;
        }
        //Take x
        subset.add(vals[idx]);
        helper(idx+1);
        subset.remove(subset.size()-1);
        //leave all x's
        int z=siz;
        for (int i = idx+1; i < siz; i++) {
            if(vals[i]!=vals[idx])
            {
                z=i;
                break;
            }
        }
        helper(z);
    }


}