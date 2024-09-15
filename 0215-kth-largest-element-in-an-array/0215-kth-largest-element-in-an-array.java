class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>queu=new PriorityQueue<>(Comparator.reverseOrder());
        int siz=nums.length;
        for(int i=0;i<siz;i++)
            queu.add(nums[i]);
        for(int i=0;i<k-1;i++)
            queu.poll();
        return queu.poll();
    }

}