class Solution {
      public int[] applyOperations(int[] nums) {

          int len=nums.length;
          for (int i = 0; i < len-1; i++) {
              if(nums[i]==nums[i+1])
              {
                  nums[i]*=2;
                  nums[i+1]=0;
              }
          }
          // get zeros at last

          int replaceIndex=0;
          int temp;
          for (int i = 0; i < len; i++) {

              if(nums[i]>0)
              {
                  temp=nums[replaceIndex];
                  nums[replaceIndex]=nums[i];
                  nums[i]=temp;
                  replaceIndex++;
              }
              else
              {
                  if (nums[replaceIndex]!=0)
                      replaceIndex=0;
              }

          }
          return nums;
      }
  }