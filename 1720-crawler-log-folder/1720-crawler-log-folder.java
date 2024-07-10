class Solution {
    public int minOperations(String[] logs) {
             int path=0;
        for (String x:logs) {
            if(x.equals("../"))
                path--;
            else if (x.equals("./")) {
                 continue;
            }
            else 
                path++;
            if(path<0)
                path=0;
        }
        return path;
    }
}