class Solution {
    public boolean isArraySpecial(int[] nums) {

        int cur=nums[0];

        boolean flag=true;
        int len=nums.length;
        for(int i=1;i<len;i++)
        {
           if(cur%2==nums[i]%2)
           {
              return false;
           }
           cur=nums[i];
        }
        
        return flag;
    }
}