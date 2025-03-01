/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
      public Node copyRandomList(Node head) {
          Map<Node,Node> nodeMap=new HashMap<>();
          nodeMap.put(null,null);
          Node curr=head;
          while (curr!=null)
          {
              nodeMap.put(curr,new Node(curr.val));
              curr=curr.next;
          }
          curr=head;
          Node pointer=null;
          while (curr!=null)
          {
              pointer=nodeMap.get(curr);
              pointer.next=nodeMap.get(curr.next);
              pointer.random=nodeMap.get(curr.random);
              curr=curr.next;
          }
          return nodeMap.get(head);

      }
  }