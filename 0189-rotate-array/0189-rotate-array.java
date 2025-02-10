class Solution {
    public void rotate(int[] nums, int k) {
          int len=nums.length;
          k=k%len;
          reverseArray(nums,0,len-1);
          reverseArray(nums,0,k-1);
          reverseArray(nums,k,len-1);
    }

    private void reverseArray(int[] nums, int start, int end) {
        int temp;
        while (start<end)
        {
            temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}