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
      public ListNode partition(ListNode head, int x) {
          ListNode lowerPartHead=null;
          ListNode HigherPartHead=null;
          ListNode currentHigher = null;
          ListNode newHead=null;
          while (head!=null)
          {
              if(head.val<x)
              {
                  if (lowerPartHead==null){
                      lowerPartHead=head;
                      newHead=head;
                  }
                  else
                  {
                      lowerPartHead.next=head;
                      lowerPartHead=lowerPartHead.next;
                  }

              }
              else
              {

                  if (HigherPartHead==null)
                  {
                      HigherPartHead=head;
                      currentHigher=HigherPartHead;
                  }
                  else
                  {
                      currentHigher.next=head;
                      currentHigher=currentHigher.next;
                  }
              }
              head=head.next;
          }
          if(currentHigher!=null)
              currentHigher.next=null;
          //System.out.println(currentHigher.val);
          if(lowerPartHead!=null)
              lowerPartHead.next=HigherPartHead;
          else    // no lower part
          {
              return HigherPartHead;
          }
          return newHead;
      }
  }