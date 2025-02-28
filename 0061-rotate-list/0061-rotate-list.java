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
    public ListNode rotateRight(ListNode head, int k) {

        int len=getLen(head);
        if(len==0)
            return head;

        k=k%len;
        if (k==0)
            return head;

        int okPasses=len-k;
        ListNode node=head;
        int i=0;
        ListNode prev=null;
        while (node!=null&&i<okPasses)
        {
            prev=node;
            node=node.next;
            i++;
        }
        ListNode traversingNode=node;
        while (traversingNode.next!=null)
        {
            traversingNode=traversingNode.next;
        }
        prev.next=null;
        traversingNode.next=head;
        return node;
    }

    private int getLen(ListNode head) {
        int l=0;
        ListNode x=head;
        while (x!=null)
        {
            x=x.next;
            l++;
        }
        return l;
    }
}