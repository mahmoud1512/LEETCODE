class Solution {
    public int longestConsecutive(int[] nums) {
        int longestStreak = 0;
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }
        
        for (int num : set) {    //iterate on set directly 0,1,1,2  answer is 3
            if (!set.contains(num - 1)) { // Check if it's the start of a sequence
                int currentNum = num;
                int currentStreak = 0;
                
                while (set.contains(currentNum)) {
                    currentStreak++;
                    currentNum++;
                }
                
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        
        return longestStreak;
    }
}
