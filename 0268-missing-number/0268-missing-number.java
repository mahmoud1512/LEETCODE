class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
          int Tot=(n*(n+1))/2;
          int nTot=0;
        for (int i = 0; i < n; i++) {
            nTot+=nums[i];
        }
        return Tot-nTot;
    }
}