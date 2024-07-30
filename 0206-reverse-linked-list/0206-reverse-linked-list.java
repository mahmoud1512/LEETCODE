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
    public ListNode reverseList(ListNode head) {
        return Reverse(head,null);
    }
    ListNode Reverse(ListNode head,ListNode prev)
    {
        if(head==null) return prev;       //if we get to the end --> return prev
        ListNode next=head.next;         //save the next as we gonna change it
        head.next=prev; 
        return Reverse(next,head);       //previous node is just the head
    }
}
