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
      public ListNode reverseBetween(ListNode head, int left, int right) {
           ListNode dummy=new ListNode();
           dummy.next=head;
           ListNode l=dummy;
           ListNode bl=null;
          for (int i = 0; i < left; i++) {
              if(i==left-1)
                  bl=l;
              l=l.next;
          }
          ListNode x=l.next;
          int reversals=right-left;
          ListNode temp;
          ListNode ll=l;
          for (int i = 0; i < reversals; i++) {
              temp=x;
              x=x.next;
              temp.next=l;
              l=temp;
          }
        //   if(left!=1)
            bl.next=l;
          ll.next=x;
          return dummy.next;
          
      }
  }