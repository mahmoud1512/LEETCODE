class Solution {
    public long maxKelements(int[] nums, int k) {
          PriorityQueue<Integer>priorityQueue=new PriorityQueue<>(Collections.reverseOrder());
        for (int x:nums) {
            priorityQueue.add(x);
        }
        long score=0;
        while (k>0)
        {
            int z=priorityQueue.poll();
            score+=z;
            priorityQueue.add(Math.ceilDiv(z,3));
            k--;
        }
        return score;
    }
}