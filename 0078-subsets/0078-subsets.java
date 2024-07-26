class Solution {
    List<List<Integer>>list=new ArrayList<>();
    int base;
    int[]Nums;
    public List<List<Integer>> subsets(int[] nums) {
        base=nums.length;
        Nums=nums;
        solve(0,new ArrayList<>());
        return list;
    }
    void solve(int idx,ArrayList<Integer>l)
    {
        if(idx==base)
        {
            list.add(l);
            return;
        }
        solve(idx+1,l);
        ArrayList<Integer>arrayList=new ArrayList<>(l);
        arrayList.add(Nums[idx]);
        solve(idx+1,arrayList);




    }

}