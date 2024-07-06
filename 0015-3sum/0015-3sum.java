class Solution {
    List<List<Integer>>ANS=new ArrayList<>();
    Set<Integer>used=new HashSet<>();
    int []pseudo;
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        pseudo=nums;
        int siz=nums.length;
        for (int i = 0; i <siz-2; i++) {
            if(used.contains(nums[i]))
                continue;
            used.add(nums[i]);
            int find=0-nums[i];
            AddTwoSum(i+1,siz-1,find,nums[i]);
        }
        return ANS;
    }
    void AddTwoSum(int st,int end,int target,int found)
    {
        Set<Integer>USED2=new HashSet<>();
        while(st<end)
        {
            if((pseudo[st]+pseudo[end])==target)
            {
                if(!(USED2.contains(pseudo[st]))) {
                    ANS.add(new ArrayList<>(Arrays.asList(found, pseudo[st], pseudo[end])));
                    USED2.add(pseudo[st]);
                    USED2.add(pseudo[end]);
                }
                st++;end--;
            }
            else if (pseudo[st]+pseudo[end]>target) {
                end--;
            }
            else
                st++;
        }
    }
}