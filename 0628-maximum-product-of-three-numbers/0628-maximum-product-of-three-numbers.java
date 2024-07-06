class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int siz= nums.length-1;
        int p1=nums[0]*nums[1]*nums[siz];
        int p2=nums[0]*nums[1]*nums[2];
        int p3=nums[siz]*nums[siz-1]*nums[siz-2];
        return Math.max(p1,Math.max(p2,p3));
    }
}