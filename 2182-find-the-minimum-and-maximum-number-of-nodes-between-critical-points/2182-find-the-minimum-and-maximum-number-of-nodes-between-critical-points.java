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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
         ArrayList<Integer>list=new ArrayList<>();
         ArrayList<Integer>places=new ArrayList<>();
         while(!(head==null))
         {
             list.add(head.val);
             head=head.next;
         }
         int siz=list.size();
         if(siz<=2)
             return new int[]{-1,-1};
         int mn=Integer.MAX_VALUE;
        for (int i = 1; i <= siz-2; i++) {
            if(list.get(i)< list.get(i-1)&&list.get(i)<list.get(i+1))
            {
                places.add(i);
                int si=places.size();
                if(!(si==1))
                {
                    int val=places.get(si-1)-places.get(si-2);
                    if(mn>val)
                    {
                        mn=val;
                    }
                }
            }
            else if (list.get(i)> list.get(i-1)&&list.get(i)>list.get(i+1)) {
                places.add(i);
                int si=places.size();
                if(!(si==1))
                {
                    int val=places.get(si-1)-places.get(si-2);
                    if(mn>val)
                    {
                        mn=val;
                    }
                }
            }
        }
        if(places.size()<2)
            return new int[]{-1,-1};
        Collections.sort(places);
        return new int[]{mn, places.get(places.size()-1)- places.get(0)};
    }
}