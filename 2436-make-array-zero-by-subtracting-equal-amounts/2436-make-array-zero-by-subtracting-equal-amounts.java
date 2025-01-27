class Solution {
    public int minimumOperations(int[] nums) {

        Arrays.sort(nums);
        int factor=0;
        int numberOfFactorChanges=0;
        for (int x:nums) {
            if(x==0)
                continue;
            
            if(x>factor)
            {
                factor+=x-factor;
                numberOfFactorChanges++;
            }
           
        }
        return numberOfFactorChanges;
    }
}