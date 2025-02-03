class Solution {
    public int largestRectangleArea(int[] heights) {
         int len=heights.length;
         int[] output1=getLeftMonoIncreasing(heights,len);
         int[] output2=getRightMonoIncreasing(heights,len);

         int max=Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            max=Math.max(max,heights[i]*(output2[i]-output1[i]+1));
        }
        return max;
    }

    private int[] getRightMonoIncreasing(int[] heights, int len) {
        int[]arr=new int[len];
        Stack<Integer>monoStack=new Stack<>();
        for (int i = 0; i <len ; i++) {
            while (!monoStack.isEmpty()&&heights[i]<heights[monoStack.peek()])
            {
                arr[monoStack.peek()]=i-1;
                monoStack.pop();
            }
            monoStack.push(i);
        }
        while (!monoStack.isEmpty())
        {
            arr[monoStack.peek()]=len-1;
            monoStack.pop();
        }
        return arr;
    }

    private int[] getLeftMonoIncreasing(int[] heights, int len) {
        int[]arr=new int[len];
        Stack<Integer>monoStack=new Stack<>();
        for (int i = len-1; i >=0 ; i--) {
            while (!monoStack.isEmpty()&&heights[i]<heights[monoStack.peek()])
            {
                arr[monoStack.peek()]=i+1;
                monoStack.pop();
            }
            monoStack.push(i);
        }
        while (!monoStack.isEmpty())
        {
            arr[monoStack.peek()]=0;
            monoStack.pop();
        }
        return arr;
    }
}
