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
      public ListNode removeNthFromEnd(ListNode head, int n) {
           ListNode before=null,slow=head,fast=head;
          for (int i = 0; i < n; i++) {
              fast=fast.next;
          }
          while (fast!=null)
          {
              fast=fast.next;
              before=slow;
              slow=slow.next;
          }
          ListNode next=slow.next;
          if(before==null)   // removing first element
            return next;
          before.next=next;
          return head;
      }
  }