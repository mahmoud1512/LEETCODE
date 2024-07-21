class Solution {
    public int hammingWeight(int n) {
        int ans=n;
        int count=0;
        int siz= (int) ((Math.log(n)/Math.log(2))+1);
        for (int i = 0; i < siz; i++) {
            int val=ans|(1<<i);
            if(val==ans)
                count++;
            ans=val;
        }
        return count;
    }
}
