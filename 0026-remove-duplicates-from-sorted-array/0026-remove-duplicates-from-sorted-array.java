class Solution {
    public int removeDuplicates(int[] nums) {    // in place algorithm
           int nextAvailable=-1;  // assuming all are distinct elements in first glance
        int len=nums.length;
        int distinct =1;  // counter for distinct values
        for (int i = 1; i <len ; i++) {
            if(nums[i]!=nums[i-1])  // new distinct value
            {
                if(nextAvailable<i &&nextAvailable!=-1) {
                    nums[nextAvailable] = nums[i];
                    nextAvailable++;
                }
                distinct++;
            }
            else if (nums[i]==nums[i-1])  // a duplicate Value
            {
                if(nextAvailable==-1)
                    nextAvailable=i;
            }
        }
        return distinct;
    }
}