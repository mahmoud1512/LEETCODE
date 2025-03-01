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

          ListNode beforeLeft=null; // dummy now
          ListNode afterRight=null;
          ListNode x1=head;
          ListNode x2=head;
          boolean thereIsLeft=false;
          for (int i = 1; i < left; i++) {
              if(i==left-1)
              {
                  beforeLeft=x1;
                  thereIsLeft=true;
              }
              x1=x1.next;
              x2=x2.next;
          }
          if(thereIsLeft)
            beforeLeft.next=null;
          for (int i = left; i < right; i++) {
              x2=x2.next;
          }
          
        afterRight=x2.next;
        x2.next=null;
          
          ListNode x=x1.next;
          ListNode v=x1;
         
          ListNode temp;
          while (x!=null)
          {
              temp=x;
              x=x.next;
              temp.next=x1;
              x1=temp;
          }
          if (thereIsLeft)
          {
              beforeLeft.next=x1;
              v.next=afterRight;

              return head;
          }
          else
          {
              v.next=afterRight;
              return x1;
          }

      }
  }