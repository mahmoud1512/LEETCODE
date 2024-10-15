class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> bfsQueue = new ArrayDeque<>();
        bfsQueue.add(root);
        int siz = 1, added ;
        int count ;
        int max = Integer.MIN_VALUE;
        int maxLevel=0;
        int currentLevel=0;
        while (!bfsQueue.isEmpty()) {

              count=0;
              added=0;
              currentLevel++;
            for (int i = 0; i < siz; i++) {
                TreeNode x = bfsQueue.poll();
                count += x.val;
                if (x.left != null) {
                    added++;
                    bfsQueue.add(x.left);
                }
                if (x.right != null) {
                    added++;
                    bfsQueue.add(x.right);
                }
            }
           if(count>max)
           {
               max=count;
               maxLevel=currentLevel;
           }
            siz=added;
        }
        return maxLevel;
    }
}