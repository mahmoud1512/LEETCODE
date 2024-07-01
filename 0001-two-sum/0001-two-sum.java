class Solution {
    Map<Integer,Integer>map=new HashMap<>();
    public int[] twoSum(int[] nums, int target) {
        int siz= nums.length;
        for (int i = 0; i < siz; i++) {
            if(map.containsKey(target-nums[i]))
            {
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i );
        }
        return null;
    }
}