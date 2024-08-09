/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/
class Solution {
    Node ans=new Node(1);
    Map<Integer,Node>NodeGetter=new HashMap<>();
    Map<Integer,Boolean>finishedFlag=new HashMap<>();
    Queue<Node>nodeQueue=new ArrayDeque<>();
    Set<Integer>added=new HashSet<>();
    public Node cloneGraph(Node node) {
        if(node==null)return null;
        NodeGetter.put(1,ans);
        finishedFlag.put(1,false);
        nodeQueue.add(node);
        int siz=1,depth;
        while (!nodeQueue.isEmpty())
        {
            depth=0;
            for (int i = 0; i < siz; i++) {
                Node v=nodeQueue.poll();
                Node n=NodeGetter.get(v.val);
               for(Node x:v.neighbors)
               {
                   if(!NodeGetter.containsKey(x.val))
                   {
                       NodeGetter.put(x.val,new Node(x.val));
                       finishedFlag.put(x.val,false);
                   }
                   if(!finishedFlag.get(x.val)&&!added.contains(x.val))
                   {
                       nodeQueue.add(x);
                       added.add(x.val);
                       depth++;
                   }
                   n.neighbors.add(NodeGetter.get(x.val));
               }
               finishedFlag.put(n.val,true);
            }
            siz=depth;

        }
        return ans;

    }
}