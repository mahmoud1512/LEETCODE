class Solution {
    private int counter=0;
    private int targetIndex;
    ListNode ProxyHead;
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
                ProxyHead=head;
                targetIndex=n;
               solve(null,head,head.next);
          return ProxyHead;     
    }

    private void solve(ListNode before, ListNode head, ListNode next) {
        if(head==null)
          return;
        if(next==null){
            solve(head,null,null);
        }
        else 
            solve(head,head.next,head.next.next);

        counter++;
        if(counter==targetIndex)
        {
            if(before==null)
               ProxyHead=next;
            else    
              before.next=next;
        }
    }
}