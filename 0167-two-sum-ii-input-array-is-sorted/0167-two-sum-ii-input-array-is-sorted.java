class Solution {
    public int[] twoSum(int[] numbers, int target) {
          int[] ans=new int[2];
          int l=0,r=numbers.length-1;
          int sum;
          while(l<r)
          {
            sum=numbers[l]+numbers[r];
            if(sum==target)
            {
                ans[0]=l+1;
                ans[1]=r+1;
                return ans;
            }
            else if(sum<target)
            {
                l++;
            }
            else
            {
                r--;
            }
          }
          return null;
    }
}