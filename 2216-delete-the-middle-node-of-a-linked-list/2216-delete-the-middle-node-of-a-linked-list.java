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
    public ListNode deleteMiddle(ListNode head) {

        ListNode L=null,T=head;
        while (T!=null&&T.next!=null)
        {
            T=T.next.next;
             if(L==null)
             {
               L=head;
             }
             else
             {
               L=L.next;
             }

        }
        if(L==null)
            return null; 
        L.next=L.next.next;
        return head;
    }
}