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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         
          ListNode ans=new ListNode(-1);
          ListNode curr3=ans;
          while (list1!=null&&list2!=null)
          {
              if(list1.val<=list2.val) {
                  curr3.next=new ListNode(list1.val);
                  curr3=curr3.next;
                  list1=list1.next;
              }
              else
              {
                  curr3.next=new ListNode(list2.val);
                  curr3=curr3.next;
                  list2=list2.next;
              }
          }
          while (list1!=null)
          {
              curr3.next=new ListNode(list1.val);
              curr3=curr3.next;
              list1=list1.next;
          }
          while (list2!=null)
          {
              curr3.next=new ListNode(list2.val);
              curr3=curr3.next;
              list2=list2.next;
          }
          return ans.next;
    }
}