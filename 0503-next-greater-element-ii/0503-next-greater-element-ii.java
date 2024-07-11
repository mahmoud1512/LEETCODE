class Solution {
    public int[] nextGreaterElements(int[] nums) {
            int max=-1000000000, maxindex=-1;
            int size=nums.length;
            Stack<Integer>st=new Stack<>();   //mono decreasing
            int []ans=new int[size];
            int accepted=0;
            Arrays.fill(ans,-1);
        for (int i = 0; i <size ; i++) {
              while (!(st.isEmpty())&&(nums[i]>nums[st.peek()]))
              {
                  ans[st.pop()]=nums[i];
                  accepted++;
              }
              if (nums[i]>max)
              {
                  max=nums[i];
                  maxindex=i;
              }
              st.push(i);
        }
        ans[maxindex]=-1;
        if(accepted==size-1)
            return ans;
        else
        {
            for (int i = 0; i <=maxindex; i++) {
                while (!(st.isEmpty())&&nums[i]>nums[st.peek()])
                {
                    ans[st.pop()]=nums[i];
                   
                }
                st.push(i);
            }
            return ans;
        }
        
    }
}