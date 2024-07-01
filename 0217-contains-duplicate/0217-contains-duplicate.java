class Solution {
    Set<Integer>freqSet=new HashSet<>();
    public boolean containsDuplicate(int[] nums) {
        int siz= nums.length;
        for (int i = 0; i <siz ; i++) {
            if (freqSet.contains(nums[i]))
                return true;
            else 
                freqSet.add(nums[i]);
        }
        return false;
    }
}