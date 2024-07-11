class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //map + monotonic stack
        int siz2=nums2.length;
        Map<Integer,Integer>mp=new HashMap<>();  // value , index pair
        int[]answers=new int[siz2];
        Stack<Integer>st=new Stack<>();
        for (int i = 0; i < siz2; i++) {
            mp.put(nums2[i],i);
            while (!(st.isEmpty())&&nums2[i]>nums2[st.peek()])   //mono decreasing
            {
                answers[st.pop()]=nums2[i];
            }
            st.push(i);
        }
        int []ans=new int[nums1.length];
        int j=0;
        for (int x:nums1) {
            int i= mp.get(x);
            if(answers[i]!=0)
                ans[j++]=answers[i];
            else 
                ans[j++]=-1;
        }
        return ans;

    }
}