/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
          sortTheList(head,null);
          return head;
    }

    private void sortTheList(ListNode head,ListNode end) {
        if(head==null||head.next==null||head==end)
            return;
        ListNode x=Random_partition(head,end);
        sortTheList(head,x);
        sortTheList(x.next,end);

    }

    private ListNode Random_partition(ListNode head, ListNode end) {
        ListNode turtle=head,rabbit=head;
        int l=0;
        while (rabbit!=end&&rabbit.next!=end)
        {
            rabbit=rabbit.next.next;
            l++;
        }
        l=l*2-1;
        int p= (int) Math.floor(Math.random()*l);
        int z=0;
        while (turtle!=end)
        {
            z++;
            if(z==p) {
                swap(head, turtle);
                break;
            }
            turtle=turtle.next;
        }
        return partition(head,end);
        
    }

    private ListNode partition(ListNode head,ListNode end) {
        ListNode temp=head.next;
        ListNode st=head;
        while (temp!=end)
        {
           if(temp.val<=head.val)
           {
               st=st.next;
               swap(st,temp);
           }
           temp=temp.next;
        }
        swap(head,st);
        return st;
    }

    private void swap(ListNode biggerPart, ListNode temp) {

        int x=temp.val;
        temp.val= biggerPart.val;
        biggerPart.val=x;
    }
}