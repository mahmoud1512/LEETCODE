 class Solution {
    ListNode start;
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode clone=head;
        int length= findLength(clone);
        List<ListNode>prev=null;
        List<ListNode>curr = null;
        start=head;
        while (length>=k)
        {
            curr=Swapper(start,k);
            if(prev==null)
            {
                head=curr.get(1);
                prev=curr;
            }
            else
            {
                prev.get(0).next=curr.get(1);
                prev=curr;
            }

            length-=k;
        }

        if(length!=0)
        {
            curr.get(0).next=start;
        }

        return head;
    }

    private int findLength(ListNode clone) {
        int siz=0;
        while (clone!=null)
        {
            siz+=1;
            clone=clone.next;
        }
        return siz;
    }
    private List<ListNode>Swapper(ListNode Start,int k)
    {
        List<ListNode> ans=new ArrayList<>();
        ans.add(Start);
        ListNode prev=null,curr=Start;
        ListNode Dummy=curr.next;
        //System.out.println(curr.val);
        while (k>0)
        {
            curr.next=prev;
            prev=curr;
            curr=Dummy;
            if(Dummy!=null)
             Dummy=Dummy.next;
            k--;
        }
        start=curr;
        ans.add(prev);
        return ans;
    }
}