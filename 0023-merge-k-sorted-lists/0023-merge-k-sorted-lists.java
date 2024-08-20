class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<int[]>priorityQueue=new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        ListNode ans=new ListNode();
        ListNode temp=ans;
        int siz= lists.length;
        boolean checkPopulated=false;
        for (int i = 0; i < siz; i++) {
            if(lists[i]!=null) {
                priorityQueue.add(new int[]{lists[i].val, i});
                checkPopulated=true;
            }
        }
        if(!checkPopulated)
            return null;
        while (!priorityQueue.isEmpty())
        {
            ListNode next;
            int[]pop=priorityQueue.poll();
            ans.val=pop[0];
            if(lists[pop[1]].next!=null)
            {
                lists[pop[1]]=lists[pop[1]].next;
                priorityQueue.add(new int[]{lists[pop[1]].val,pop[1]});
            }
            if(priorityQueue.size()>=1)
            {
                next=new ListNode();
                ans.next=next;
                ans=next;
            }

        }
        return temp;
    }
}