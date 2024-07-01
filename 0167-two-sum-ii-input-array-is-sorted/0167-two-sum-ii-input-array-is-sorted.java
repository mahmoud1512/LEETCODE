class Solution {
    public int[] twoSum(int[] numbers, int target) {
           int l=1,r=numbers.length;
           while(r>l)
           {
               if (numbers[l-1]+numbers[r-1]==target)
                   return new int[]{l,r};
               else if (numbers[l-1]+numbers[r-1]<target)
                   l++;
               else
                   r--;
           }
           return null;
    }
}