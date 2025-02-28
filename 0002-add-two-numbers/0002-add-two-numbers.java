class Solution {
      public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          int currentValue=0;
          ListNode head=l1;
          ListNode concat1 =null;
          ListNode concat2=null;
          while (l1!=null&&l2!=null)
          {
              int v= currentValue+l1.val+l2.val;
              l1.val=v%10;
              currentValue=v/10;
              if(l1.next==null)
                  concat1 =l1;
              l1=l1.next;
              l2=l2.next;
          }
         
          while (l1!=null)
          {
             
              int v= currentValue+l1.val;
              l1.val=v%10;
              currentValue=v/10;
              if(l1.next==null)
                  concat1 =l1;
              l1=l1.next;
          }
          while (l2!=null)
          {
              if(concat2==null)
                  concat2=l2;
              int v= currentValue+l2.val;
              currentValue=v/10;
              l2.val=v%10;
              if(l2.next==null&&currentValue!=0) {
                  l2.next = new ListNode(currentValue);
                  break;
              }
              l2=l2.next;
          }

          if(concat2==null&&currentValue!=0)
              concat2=new ListNode(currentValue);

          concat1.next=concat2;


          return head;
      }
  }