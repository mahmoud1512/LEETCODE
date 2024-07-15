/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Map<Integer,TreeNode>map=new HashMap<>();
    Set<Integer>hasParent=new HashSet<>();
    public TreeNode createBinaryTree(int[][] descriptions) {
        int siz=descriptions.length;
        for (int i = 0; i < siz; i++) {
            TreeNode x;
            TreeNode y;
            if(map.containsKey(descriptions[i][0]))
            {
                x = map.get(descriptions[i][0]);
                
                if(map.containsKey(descriptions[i][1]))
                    y=map.get(descriptions[i][1]);
                else 
                    y=new TreeNode(descriptions[i][1]);
                map.put(descriptions[i][1],y);
                if (descriptions[i][2]==1)
                {
                    x.left=y;
                    //map.put(descriptions[i][0],x);
                }
                else {
                    x.right=y;
                    //map.put(descriptions[i][0],x);
                }
            }
            else
            {
                x = new TreeNode(descriptions[i][0]);
                
                if(map.containsKey(descriptions[i][1]))
                    y=map.get(descriptions[i][1]);
                else
                    y=new TreeNode(descriptions[i][1]);
                
                if(descriptions[i][2]==1)
                {
                    x.left=y;
                }
                else
                    x.right=y;
                map.put(descriptions[i][0],x);
                map.put(descriptions[i][1],y);
            } hasParent.add(descriptions[i][1]);
        }
        for (int i = 0; i < siz; i++) {
            if(!hasParent.contains(descriptions[i][0]))
                return map.get(descriptions[i][0]);
        }
        return null;
    }
}