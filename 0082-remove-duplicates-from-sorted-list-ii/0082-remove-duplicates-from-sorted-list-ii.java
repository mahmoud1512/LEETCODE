class Solution {
      public ListNode deleteDuplicates(ListNode head) {
          // Algorithm : pointer to new head , two pointers to traverse the list , one pointer to traverse new head
          ListNode dummyHead=new ListNode();
          ListNode newListTraversal=dummyHead;
          if(head==null)
              return null;
          ListNode p1=head,p2=head.next;
          while(p1!=null)
          {
              if(p2==null||p1.val!=p2.val)
              {
                  newListTraversal.next=new ListNode(p1.val);
                  newListTraversal=newListTraversal.next;
              }
              
              while (p2!=null&&p1.val==p2.val)
              {
                  p2=p2.next;
              }
              p1=p2;
              if(p1!=null)
              {
                  p2=p1.next;
              }
          }
          return dummyHead.next;
      }
  }