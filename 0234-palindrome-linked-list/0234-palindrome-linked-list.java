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
    public boolean isPalindrome(ListNode head) {
       ArrayList<Integer>x=new ArrayList<>();
        while(head!=null)
        {
          x.add(head.val);
          head=head.next;
        }
        int l=0,r=x.size()-1;
        while (l<r)
        {
            if(!(x.get(l)==x.get(r)))
                return false;
            else {
                l++;
                r--;
            }
        }
        return true;
      
    }
}