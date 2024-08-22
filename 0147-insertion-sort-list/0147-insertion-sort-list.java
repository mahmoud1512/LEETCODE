class Solution {
      public ListNode insertionSortList(ListNode head) {
          ListNode unSorted=head; ListNode sorted=new ListNode(Integer.MIN_VALUE);
          while (unSorted!=null)
          {
              ListNode ToAdd=unSorted;
              unSorted=unSorted.next;
              ListNode prev=null,curr=sorted;
              while(curr!=null)
              {
                  if(curr.val> ToAdd.val)
                  {
                      break;
                  }
                  prev=curr;
                  curr=curr.next;
              }
              
              prev.next=ToAdd;
              ToAdd.next=curr;
             
          }
          return sorted.next;
      }
  }