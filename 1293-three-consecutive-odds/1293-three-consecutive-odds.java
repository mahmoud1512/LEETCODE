class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
           int oddStreak=0;
           int siz=arr.length;
        for (int i = 0; i < siz; i++) {
            if (arr[i]%2==1)
                oddStreak++;
            else 
                oddStreak=0;
            if(oddStreak==3)
                return true;
            
        }
        return false;
    }
}