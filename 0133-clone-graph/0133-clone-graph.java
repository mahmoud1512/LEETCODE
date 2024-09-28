class Solution {
    Map<Node,Node>nodeMap;

    public Node cloneGraph(Node node) {
        if(node==null)return null;
        nodeMap=new HashMap<>();
        dfs(node);
       return nodeMap.get(node);
    }

    private void dfs(Node node) {
        if(nodeMap.containsKey(node))
            return;
       
        nodeMap.put(node,new Node(node.val));
        Node added=nodeMap.get(node);
        
        for (Node n: node.neighbors)
        {
            dfs(n);
            
            if(added.neighbors==null)
                added.neighbors=new ArrayList<>();
            added.neighbors.add(nodeMap.get(n));
            
        }
            
    }
}