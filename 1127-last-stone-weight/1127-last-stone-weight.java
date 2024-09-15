class Solution {
    public int lastStoneWeight(int[] stones) {
         PriorityQueue<Integer>queue=new PriorityQueue<>(Comparator.reverseOrder());
         int siz=stones.length;
        for (int i = 0; i < siz; i++) {
            
            queue.add(stones[i]);
        }
        while (queue.size()>1)
        {
            int x=queue.poll();
            int y=queue.poll();
            if(x==y)
                continue;
            queue.add(x-y);
        }
        if(queue.size()==0)
            return 0;
        else 
            return queue.peek();
    }
}