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
    public ListNode middleNode(ListNode head) {
           ListNode l=head,r=head;
           while (r!=null&&r.next!=null)
           {
               l=l.next;
               r=r.next.next;
           }
           return l;
    }
}