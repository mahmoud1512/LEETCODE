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
      ListNode H,curr;
      int cnt,val;
    public void reorderList(ListNode head) {
          H=head;curr=head;
          Reoreder(curr);
       if(cnt%2==0)
       {
           H.next.next=null;
       }
       else
         {
            H.next=null;
         }
    }
    void Reoreder(ListNode curr)
    {
        if(curr==null)return;
        cnt++;val++;
        Reoreder(curr.next);
        if(val>cnt/2+1) {
            ListNode next = H.next;
            H.next = curr;
            curr.next = next;
            H = next;
            val--;
        }
    }
}