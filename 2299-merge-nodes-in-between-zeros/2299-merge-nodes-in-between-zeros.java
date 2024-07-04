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
    public ListNode mergeNodes(ListNode head) {
              ListNode x=head;
              ListNode y=head.next;
              ArrayList<Integer>list=new ArrayList<>();
              while(x!=null)
              {
                  int val=0;
                  while(!(y==null)&&y.val!=0)
                  {
                      val+=y.val;
                      y=y.next;
                      x=x.next;
                  }
                  x=x.next;
                if(!(y.next==null)){
                  y=y.next; 
                }
                if(!(x==null))
                 list.add(val);
              }
           int siz=list.size();
            ListNode ans=new ListNode(list.get(0));
            ListNode v=ans;
        for (int i = 1; i < siz; i++) {
            if(i==siz-1)
            {
                ans.next=new ListNode(list.get(i),null);
                break;
            }
            ans.next=new ListNode(list.get(i));
            ans=ans.next;
        }
        return v;
             

    }
}