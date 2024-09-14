public class Codec {
    int idx = 0;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null)
            return "*";
        return Integer.toString(root.val) + "#" + serialize(root.left) + serialize(root.right);

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("*"))
            return null;
        TreeNode x = null;
        return solve(x, data);
    }

    TreeNode solve(TreeNode x, String data) {
      
            if (data.charAt(idx) == '*') {
                x = null;
                idx++;
                return x;
               
            } else {
                String v = "";
                while (data.charAt(idx) != '#') {
                    v += data.charAt(idx);
                    idx++;
                }
                x = new TreeNode();
                x.val = Integer.parseInt(v);
                idx++;
               x.left= solve(x.left, data);
               x.right= solve(x.right, data);
            }
        
        return x;
    }
}