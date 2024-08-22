class Solution {
    Map<Node,Node> NodeMap;
    public Node copyRandomList(Node head) {
        NodeMap=new HashMap<>();
        Node ans=head;
        Node unCopiedCurrent=head;
        Node CopiedCurrent=null,CopiedPrev=null;
        while (unCopiedCurrent!=null)
        {
            CopiedCurrent=new Node(unCopiedCurrent.val);
            NodeMap.put(unCopiedCurrent,CopiedCurrent);
            if(CopiedPrev==null)
            {
                CopiedPrev=CopiedCurrent;
            }
            else
            {
                CopiedPrev.next=CopiedCurrent;
                CopiedPrev=CopiedCurrent;
            }
            unCopiedCurrent=unCopiedCurrent.next;
        }
        while (head!=null)
        {
            Node x=NodeMap.get(head);
            x.random=NodeMap.get(head.random);
            head=head.next;
        }
        return NodeMap.get(ans);
    }
}