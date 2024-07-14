class Solution {
    public int largestRectangleArea(int[] heights) {
        int siz=heights.length;
        int[]nextSmallerLeft=new int[siz];
        Arrays.fill(nextSmallerLeft,-1);
        int[]nextSmallerRight=new int[siz];
        Arrays.fill(nextSmallerRight,siz);
        Stack<Integer>stack=new Stack<>();
        for (int i = 0; i < siz; i++) {
            while (!(stack.isEmpty())&&heights[i]<heights[stack.peek()])
            {
                
                nextSmallerRight[stack.pop()]=i;
            }
            stack.push(i);
        }
        stack=new Stack<>();
        for (int i = siz-1; i >=0 ; i--) {
            while (!(stack.isEmpty())&&heights[i]<heights[stack.peek()])
            {
                nextSmallerLeft[stack.pop()]=i;
            }
            stack.push(i);
        }
        int ans=0;
        for (int i = 0; i < siz; i++) {
            int val=heights[i]*(nextSmallerRight[i]-nextSmallerLeft[i]-1);
            ans=Math.max(ans,val);
        }
        return ans;
    }
}