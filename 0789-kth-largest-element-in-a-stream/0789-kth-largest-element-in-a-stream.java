class KthLargest {
    PriorityQueue<Integer>queue;
    int count;
    int target;

    public KthLargest(int k, int[] nums) {
       queue=new PriorityQueue<>();
       int siz=nums.length-1;
       target=k;
        Arrays.sort(nums);
        count=0;
       while(true&&siz!=-1)
       {
           queue.add(nums[siz]);
           siz--;
           count++;
           if(count==k)
               break;
       }
    }

    public int add(int val) {
        if(count!=target)
        {
            queue.add(val);
            count++;
        }
        else if(val>queue.peek())
         {
             queue.poll();
             queue.add(val);
         }
        return queue.peek();

    }
}
