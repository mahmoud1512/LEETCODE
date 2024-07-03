class Solution {
    public int[] topKFrequent(int[] nums, int k) {
           int[]freq=new int[20002];
        for (int x:nums) {
            freq[x+10000]++;
        }
        Comparator<int []>comparator=new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1]-o1[1];
            }
        };
        PriorityQueue<int[]>priorityQueue=new PriorityQueue<>(comparator);
        for (int i=0;i<20002;i++)
        {
            priorityQueue.add(new int[]{i-10000,freq[i]});
        }
        int []ans=new int[k];
        for (int i=0;i<k;i++)
        {
            ans[i]=priorityQueue.poll()[0];
        }
        return ans;
    }
}