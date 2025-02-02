class Solution {
    public boolean check(int[] nums) {
         int min=Integer.MAX_VALUE;
         int minIndex=-1;
         int len=nums.length;
        for (int i = 1; i < len; i++) {
            if(nums[i]<nums[i-1])
                minIndex=i;
        }
        if(minIndex==-1)
            minIndex=0;
        boolean flag=true;
        int max1=nums[minIndex];
        for (int i = minIndex+1; i < len; i++) {
            if(nums[i]<nums[i-1])
                flag=false;
            max1=nums[i];
        }
        if(minIndex>0&&nums[0]<max1)
        {
            flag=false;
        }
        for (int i = 1; i < minIndex; i++) {
            if(nums[i]<nums[i-1])
                flag=false;
        }
        return flag;
    }
}