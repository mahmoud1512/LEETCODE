class Solution {
    public int removeDuplicates(int[] nums) {    // in place algorithm
           int nextAvailable=-1;  // assuming all are distinct elements in first glance
        int len=nums.length;
        int distinct =1;  // counter for distinct values
        int counterForDuplicates=0;
        for (int i = 1; i <len ; i++) {
            if(nums[i]!=nums[i-1])  // new distinct value
            {
                if(nextAvailable<i &&nextAvailable!=-1) {
                    nums[nextAvailable] = nums[i];
                    nextAvailable++;
                }
                counterForDuplicates=0;
                distinct++;
            }
            else if (nums[i]==nums[i-1])  // a duplicate Value
            {
                counterForDuplicates++;
                if(counterForDuplicates==1&&nextAvailable<i &&nextAvailable!=-1)
                {
                    nums[nextAvailable] = nums[i];
                    nextAvailable++;
                }
                if (counterForDuplicates==1)
                    distinct++;
                
                else if(nextAvailable==-1)
                    nextAvailable=i;
                
            }
        }
        return distinct;
    }
}