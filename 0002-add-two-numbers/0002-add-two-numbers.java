class Solution {
      public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
             ListNode head=new ListNode(0); ListNode current=head,before=null;
             while (l1!=null&&l2!=null)
             {
                  ListNode next;
                  int v= current.val+l1.val+l2.val;
                  current.val=v%10;
                  before=current;
                  next=new ListNode(v/10);
                  current.next=next;
                  current=next;
                  l1=l1.next;
                  l2=l2.next;
             }
             while (l1!=null)
             {
                 ListNode next;
                 int v= current.val+l1.val;
                 current.val=v%10;
                 before=current;
                 next=new ListNode(v/10);
                 current.next=next;
                 current=next;
                 l1=l1.next;
             }
             while (l2!=null)
             {
                 ListNode next;
                 int v= current.val+l2.val;
                 current.val=v%10;
                 before=current;
                 next=new ListNode(v/10);
                 current.next=next;
                 current=next;
                 l2=l2.next;
             }

             if(current.val==0)
              before.next=null;


           return head;
      }
  }