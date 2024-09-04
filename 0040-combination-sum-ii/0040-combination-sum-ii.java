/*
#IMPORTANT
take leave recursive pattern
* */
class Solution {
        int siz;
        int[]vals;
        List<List<Integer>>ans;
        List<Integer> subset;
        int goal;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
          Arrays.sort(candidates);
          siz=candidates.length;
          vals=candidates;
          ans=new ArrayList<>();
          subset=new ArrayList<>();
          goal=target;
          helper(0,0);
          return ans;
    }
    void helper(int idx,long sum)
    {
        if(sum>goal||idx>siz)
            return;
        if(sum==goal)
        {
            ans.add(new ArrayList<>(subset));
            return;    //no any element can be added
        }
        if(idx==siz)
           return;
        //take
        subset.add(vals[idx]);
        helper(idx+1,sum+vals[idx]);
        subset.remove(subset.size()-1);
        //skip
        int skip=siz;
        for (int i = idx+1; i <siz ; i++) {
            if(vals[i]!=vals[idx])
            {
                skip=i;
                break;
            }
        }
        helper(skip,sum);

    }
}