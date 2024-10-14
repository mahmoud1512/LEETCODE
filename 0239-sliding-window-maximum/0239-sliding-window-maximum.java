class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
         int siz= nums.length;
         int arrSiz=siz-k+1;
         int[]ans=new int[arrSiz];
         Deque<Integer> deque=new ArrayDeque<>();
         int l=0;

        for (int i = 0; i < siz; i++) {     
            while (!deque.isEmpty()&&nums[deque.peekLast()]<=nums[i])
            {
                deque.pollLast();
            }
           
            deque.addLast(i);
           if(i-deque.peek()>=k)
             deque.pollFirst();
            if(i>=k-1){
                ans[l]=nums[deque.peek()];
                l++;
            }
            
            
           
               
            
        }
        return ans;
    }
}