class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    Set<List<Integer>>Check= new HashSet<>();
    int siz;
    int[] arr;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
              siz=nums.length;
              arr=nums;
              findSubsets(0,new ArrayList<>());
              return ans;
    }

    void findSubsets(int x, List<Integer> list) {
        if (x == siz) {
             Collections.sort(list);
            if(!Check.contains(list))
            {
                ans.add(list);
                Check.add(list);
            }
            return;
        }
        ArrayList<Integer> dummy = new ArrayList<>(list);
        dummy.add(arr[x]);
        findSubsets(x + 1, dummy);   //take
        findSubsets(x + 1, list);   //leave
    }
}