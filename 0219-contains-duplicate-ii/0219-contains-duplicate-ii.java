class Solution {
    Map<Integer,Integer>map=new HashMap<>();
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int siz= nums.length;
        for (int i = 0; i < siz; i++) {
            if(map.containsKey(nums[i]))
            {
                int top=map.get(nums[i]);
                if(i-top<=k)
                    return true;
                map.put(nums[i],i);
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        return false;
    }

}